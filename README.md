# EcoMaps

Eine interaktive Karte für umweltbewusste Fahrradfahrer*innen, die ein Elektroauto besitzen und Nachhaltigkeit und Komfort kombinieren möchten.

Die Karte zeigt Ihnen die besten Orte zum Parken und Aufladen Ihres Elektrofahrzeugs, während Sie mit dem Fahrrad durch die Stadt fahren. Sie können auch auf die Karte sehen, wo Sie in der Nähe ein Fahrrad ausleihen können. Außerdem können Sie nach Radwegen suchen, die speziell für Elektrofahrräder geeignet sind, um Ihre Fahrt so angenehm und effizient wie möglich zu gestalten.

## Komponenten

- Backend: [Dokumentation](./backend/README.md)
- PostgreSQL: [Dokumentation](./postgres/README.md)
- Geoserver: [Dokumentation](./geoserver/README.md)
- pgAdmin: [Dokumentation](./pgadmin/README.md)
- Portal: [Dokumentation](./portal/README.md)

## Installation

Folgende Schritte sind erforderlich, um das Projekt lokal auszuführen:

1. Stelle sicher, dass Docker und Docker Compose auf deinem System installiert sind.
2. Klone das Projekt-Repository von GitHub: `git clone https://github.com/liRahimpour/intervisuell.git`
3. Gehe in das Projektverzeichnis: `cd intervisuell/iv-dev-dockercompose`
4. Führe das BashScript `build.sh` aus

Weitere Informationen zur Installation und Konfiguration findest du in den entsprechenden Komponentendokumentationen.

## Komponentendokumentation

### Backend

Beschreibung und Anleitung zur Verwendung des Backend-Moduls.

- [Dokumentation](./backend/README.md)
- Endpoints:
  - http://localhost:8083/api/v1/bike_rentals
  - http://localhost:8083/api/v1/charging_stations

### PostgreSQL

Beschreibung und Anleitung zur Verwendung der PostgreSQL-Datenbank.

- [Dokumentation](./postgres/README.md)
- Host: localhost
- Port: 5432

### Geoserver

Beschreibung und Anleitung zur Verwendung des Geoservers.

- [Dokumentation](./geoserver/README.md)
- Overlay-URLs:
  - http://localhost:8084/overlay1
  - http://localhost:8084/overlay2
  - http://localhost:8084/overlay3

### pgAdmin

Beschreibung und Anleitung zur Verwendung von pgAdmin.

- [Dokumentation](./pgadmin/README.md)
- Zugriff über: http://localhost:8082

### Portal

Beschreibung und Anleitung zur Verwendung des Portals.

- [Dokumentation](./portal/README.md)
- Host: localhost
- Port: 8081

## API-Dokumentation

- [API-Dokumentation des Backends](./backend/API.md)

## Contributing

Informationen zum Beitragenden und zum Einreichen von Pull Requests findest du in der [Contributing-Anleitung](./CONTRIBUTING.md).

## Lizenz

Dieses Projekt ist unter der [Lizenz](./LICENSE) lizenziert.








