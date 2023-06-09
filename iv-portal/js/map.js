let map = L.map('map').setView([49.9929, 8.2750], 13);

// Marker zur Karte hinzufügen
const myIcon = L.AwesomeMarkers.icon({
    icon: 'spinner',
    markerColor: 'red',
    prefix: 'fa'
});


//3 baselayer
const satellite = L.tileLayer('https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}', {
    attribution: 'Map data &copy; <a href="https://www.esri.com/">Esri</a>',
    transparent: true,
    minZoom: 0,
    maxZoom: 22
});

// Add OpenStreetMap as the first base layer
let detaillierteKarte = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors',
    transparent: true,
    layers: 'osm-mapnik',
    minZoom: 0,
    maxZoom: 20
});

const standard = L.tileLayer('https://{s}.basemaps.cartocdn.com/rastertiles/voyager/{z}/{x}/{y}{r}.png', {
    attribution: 'Map tiles by Carto, under CC BY 3.0. Data by OpenStreetMap, under ODbL.',
    subdomains: 'abcd',
    minZoom: 0,
    maxZoom: 22
});

var osm_humanitarian = L.tileLayer('http://{s}.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);


//######################


// eingene WMS
const fahrradverleih = L.tileLayer.wms('http://localhost:8084/geoserver/wms', {
    layers: 'mainz:fahrradverleih',
    format: 'image/png',
    minZoom: 1,
    maxZoom: 20,
    transparent: true,
    icon: myIcon,
    attribution: '... </a>'
});



const ladestation = new L.OverPassLayer({
    'query': '(node({{bbox}})["amenity"="charging_station"];);out qt;', minZoom: 5
});


const fahrradwege = L.tileLayer.wms('http://localhost:8084/geoserver/wms', {
    layers: 'mainz:Radwege',
    format: 'image/png',
    minZoom: 1,
    maxZoom: 20,
    transparent: true,
    attribution: '... </a>'
}).addTo(map);

const supermarkt = L.tileLayer.wms('http://localhost:8084/geoserver/wms', {
    layers: 'mainz:Supermarkt',
    format: 'image/png',
    minZoom: 1,
    maxZoom: 20,
    transparent: true,
    attribution: '... </a>'
});



// ##############################################




// Create a layer control for switching between the base layers
let baseLayers = {
    'Satellit': satellite,
    'Karte': detaillierteKarte,
    'Standard': standard,
    'osm_humanitarian': osm_humanitarian
};
// Create a layer control for switching between the layers
let Overlays = {
    'Fahrradausleihe': fahrradverleih,
    'Ladestation': ladestation,
    'Fahrradwege': fahrradwege,
    'supermärkte': supermarkt
};


L.control.layers(baseLayers, Overlays).setPosition('topleft').addTo(map);
