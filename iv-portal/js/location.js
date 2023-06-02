<!--location-->
L.control.locate(
    {
        returnToPrevBounds: true,
        flyTo: true,
        position: "topleft",
        strings: {
            title: "Show me where I am, yo!"
        },
        showCompass: true,
        markerClass: L.marker,
    }
).addTo(map);
