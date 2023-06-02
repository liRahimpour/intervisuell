
//AJAx
$.ajax({
    url: 'http://localhost:8083/api/v1/bike_rentals',
    method: 'GET',
    success: function (data) {
        console.log(data); // JSON-Antwort anzeigen
    },
    error: function (xhr, status, error) {
        console.error(error); // Fehler anzeigen, falls vorhanden
    }
});

function barChartLegend() {
    var info = L.control({position: 'topright'});
    info.onAdd = function (map) {
        var div = L.DomUtil.create('div', 'info');
        div.innerHTML += '<h5></h5>';
        div.innerHTML += '<div id="chartContainer"></div>';

        return div;
    };

    info.addTo(map);
}

barChartLegend();


var indernaehe = [
    {name: 'Leihstationen', anzahl: 50},
    {name: 'Ldestationen', anzahl: 30},
];

// Diagramm erstellen
Highcharts.chart('chartContainer', {
    chart: {
        type: 'bar' // Balkendiagramm
    },
    title: {
        text: 'In der Nähe'
    },
    xAxis: {
        categories: indernaehe.map(p => p.name) // X-Achse mit Produktnamen
    },
    yAxis: {
        title: {
            text: 'Anzahl' // Y-Achse mit Anzahl
        }
    },
    series: [{
        name: 'Stationen',
        data: indernaehe.map(p => p.anzahl) // Daten für Balken
    }]
});
