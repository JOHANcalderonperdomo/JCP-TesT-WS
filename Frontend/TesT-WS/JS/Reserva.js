document.addEventListener("DOMContentLoaded", function() {
    const soloIdaRadio = document.getElementById("soloIda");
    const retornoRadio = document.getElementById("retorno");
    const salidaSection = document.getElementById("salidaSection");
    const regresoSection = document.getElementById("regresoSection");

    function updateVisibility() {
        if (soloIdaRadio.checked) {
            salidaSection.style.display = "block";
            regresoSection.style.display = "none";
        } else if (retornoRadio.checked) {
            salidaSection.style.display = "block";
            regresoSection.style.display = "block";
        }
    }

    soloIdaRadio.addEventListener("change", updateVisibility);
    retornoRadio.addEventListener("change", updateVisibility);

    // Llamada inicial para establecer la visibilidad según el estado inicial de los radio buttons
    updateVisibility();
});

document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('searchForm');
    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Evitar el envío del formulario por defecto

        const origen = document.getElementById('origen').value;
        const destino = document.getElementById('destino').value;
        const tipoCabina = document.getElementById('tipoCabina').value;
        const tipoViaje = document.querySelector('input[name="tipoViaje"]:checked').value;
        const fechaSalida = document.getElementById('fechaSalida').value;

        // Construir la URL de la solicitud al backend
        let url = ` http://localhost:9000/test-wss/v1/api/routes/origen?departureairport=${encodeURIComponent(origen)}`;
        url = `http://localhost:9000/test-wss/v1/api/routes/destino?arrivalairport=${encodeURIComponent(destino)}`;

        // Enviar la solicitud al backend con fetch
        fetch(url)
            .then(response => response.json())
            .then(data => {
                // Manipular los datos recibidos y actualizar la tabla correspondiente
                if (tipoViaje === 'soloIda') {
                    updateSalidaTable(data, fechaSalida, tipoCabina);
                    document.getElementById('salidaSection').style.display = 'block';
                    document.getElementById('regresoSection').style.display = 'none';
                } else if (tipoViaje === 'retorno') {
                    updateSalidaTable(data, fechaSalida, tipoCabina);
                    updateRegresoTable(data, fechaSalida, tipoCabina);
                    document.getElementById('salidaSection').style.display = 'block';
                    document.getElementById('regresoSection').style.display = 'block';
                }
            })
            .catch(error => console.error('Error al obtener datos del servidor:', error));
    });

    function updateSalidaTable(data, fechaSalida, tipoCabina) {
        const tableBody = document.getElementById('tablaSalidaBody');
        // Limpiar la tabla antes de agregar nuevos datos
        tableBody.innerHTML = '';

        data.forEach(vuelo => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${vuelo.departureairport.name}</td>
                <td>${vuelo.arrivalairport.name}</td>
                <td>${fechaSalida}</td>
                <td>${vuelo.time}</td>
                <td>${vuelo.flightnumber}</td>
                <td>${calcularPrecioCabina(tipoCabina)}</td>
            `;
            tableBody.appendChild(row);
        });
    }

    function updateRegresoTable(data, fechaSalida, tipoCabina) {
        const tableBody = document.getElementById('tablaRegresoBody');
        // Limpiar la tabla antes de agregar nuevos datos
        tableBody.innerHTML = '';

        data.forEach(vuelo => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${vuelo.departureairport.name}</td>
                <td>${vuelo.arrivalairport.name}</td>
                <td>${fechaSalida}</td>
                <td>${vuelo.time}</td>
                <td>${vuelo.flightnumber}</td>
                <td>${calcularPrecioCabina(tipoCabina)}</td>
            `;
            tableBody.appendChild(row);
        });
    }

    function calcularPrecioCabina(tipoCabina) {
        switch (tipoCabina) {
            case 'Primera Clase':
                return '400';
            case 'Ejecutiva':
                return '350';
            case 'Economica':
                return '300';
            default:
                return 'No especificado';
        }
    }
});
