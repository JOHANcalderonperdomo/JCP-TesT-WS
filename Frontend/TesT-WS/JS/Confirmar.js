/*async function uploadImage() {
    const fileInput = document.getElementById('fotoPasaporte');
    const ticketIdInput = document.getElementById('ticketId');

    if (!fileInput.files.length) {
        alert('Por favor, seleccione una imagen.');
        return;
    }

    const formData = new FormData();
    formData.append('file', fileInput.files[0]);
    formData.append('ticketId', ticketIdInput.value);

    try {
        const response = await fetch('/v1/api/tickets/upload', {
            method: 'POST',
            body: formData
        });

        if (response.ok) {
            alert('Imagen subida con éxito.');
        } else {
            alert('Error al subir la imagen.');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('Error al subir la imagen.');
    }
}*/

function save() {

  var selectedCountriesId = parseInt($("#selected_countries_id").val());
  if (isNaN(selectedCountriesId) || selectedCountriesId === null) {
    console.error("ID del pais no válido");
    return;
  }

  try {

    var data = {
      "firstname": $("#nombre").val(),
      "lastname": $("#apellido").val(),
      "birthdate": $("#fechaNacimiento").val(),
      "phone": $("#telefono").val(),
      "passportnumber": $("#numeroPasaporte").val(),
      "countries": {
                "id": selectedCountriesId
            },
    };

    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/test-wss/v1/api/tickets",
      method: "POST",
      dataType: "json",
      contentType: "application/json",
      data: jsonData,
      success: function (data) {
        alert("Registro agregado con éxito");
        clearData();
        loadData();


      },
      error: function (error) {
        alert(`Error no se pudo realizar el registro.`);
      },
    });
  } catch (error) {
    console.error("Error obteniendo el producto:", error);
  }
}

function loadData() {
  $.ajax({
    url: "http://localhost:9000/test-wss/v1/api/tickets",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response.data);
      var html = "";
      var data = response.data;
      data.forEach(function (item) {
        // Construir el HTML para cada objeto
        if (!item.deletedAt) {
          html +=
            `<tr>
                      <td>` + item.firstname + `</td>
                      <td>` + item.lastname + `</td>
                      <td>` + item.birthdate + `</td>
                      <td>` + item.phone + `</td>
                      <td>` + item.passportnumber + `</td>
                      <td>` + item.Countries.name + `</td>
                  </tr>`;
        }
      });

      $("#listaPasajeros").html(html);
      $("#listaPasajeros tr").click(function () {
        $("#listaPasajeros tr").removeClass("selected");
        $(this).addClass("selected");
    });

    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
    
  });
}

function loadPais() {
  console.log("Ejecutando pais");
  $.ajax({
      url: "http://localhost:9000/test-wss/v1/api/countries",
      method: "GET",
      dataType: "json",
      success: function (response) {
          if (response.status && Array.isArray(response.data)) {
              var cities = response.data.map(function (Countries) {
                  return {
                      label: Countries.name,
                      value: Countries.id // Agrega el ID como valor
                  };
              });

              // Inicializar el autocompletado en el campo de entrada de texto
              $("#countries_id").autocomplete({
                  source: function (request, response) {
                      var results = $.ui.autocomplete.filter(cities, request.term);
                      if (!results.length) {
                          results = [{ label: 'No se encontraron resultados', value: null }];
                      }
                      response(results);
                  },
                  select: function (event, ui) {
                      // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                      $("#selected_countries_id").val(ui.item.value);
                      // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                      $("#countries_id").val(ui.item.label);
                      console.log("ID de pais seleccionada: " + ui.item.value);
                      return false; // Evita la propagación del evento y el formulario de envío
                  }
              });
          } else {
              console.error("Error: No se pudo obtener la lista de ventas.");
          }
      },
      error: function (error) {
          // Función que se ejecuta si hay un error en la solicitud
          console.error("Error en la solicitud:", error);
      },
  });
}

function deleteById(id) {
  // Mostrar confirmación al usuario
  if (confirm("¿Estás seguro de que deseas eliminar este registro?")) {
    // Si el usuario confirma, realizar la eliminación
    $.ajax({
      url: "http://localhost:9000/test-wss/v1/api/tickets/" + id,
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
    }).done(function (result) {
      alert("Registro eliminado con éxito");
      loadData();
    }).fail(function (error) {
      // Manejar errores en caso de que ocurran
      console.error("Error al eliminar el registro:", error);
      alert("Error al eliminar el registro. Por favor, inténtalo de nuevo.");
    });
  } else {
    // Si el usuario cancela, no hacer nada
    console.log("Eliminación cancelada por el usuario");
  }
}

document.getElementById('eliminarPasajeroBtn').addEventListener('click', function () {
  var selectedRow = $("#listaPasajeros tr.selected");
  if (selectedRow.length === 0) {
      alert("Por favor, selecciona un pasajero para eliminar.");
      return;
  }
  var id = selectedRow.data("id");
  deleteById(id);
});

function clearData() {
  $("#id").val("");
  $("#nombre").val("");
  $("#apellido").val("");
  $("#fechaNacimiento").val("");
  $("#telefono").val("");
  $("#numeroPasaporte").val("");
  $("#countries_id").val("");
}

$(document).ready(function () {
  loadData();
  loadPais();
});


