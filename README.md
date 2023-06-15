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









-----

Die Github Seite für die Projektarbeit „Interaktive Visualisierung & Internet“ im Modul P0006

## Aufgabestellung
### Topic
Suchen Sie sich einen Topic, den Sie kreativ darstellen möchten
- Haltestellen, POIs, Restaurants, Verteilung Arbeitslose, Altersstruktur, ... Eigene Ideen?

### Teil Neis
- Mind. 2 Baselayer, z.B. OpenStreetMap, RLP Geoportal WMS
- Mind. 3 Overlays von Ihrem WMS , z.B. Straßen, POIs, Landnutzung
- Eigenes Styling Ihrer Layer
- Ein Overpass API Layer, z.B. Pubs || Haltestellen
- Ein Diagramm mit Highcharts enthalten

### Teil Böhm
- Serverseitige Komponente zur Bereitstellung von Diagrammdaten aus Datenbank
- AJAX-basierte Interaktive Komponente

### Präsentation
- Beschreibung des Sachverhalts
- Entwurfsentscheidungen des Map/Web Client, Server-Komponente
- Live Demo?
- Kritische Diskussion Ihrer Ergebnisse

## Abhängigkeiten

Dieses Readme ist in [Markdown](https://guides.github.com/features/mastering-markdown/) geschrieben. Um es zu bearbeiten reicht ein einfacher Text-Editor wie [Sublime Text](https://www.sublimetext.com/). Um eine HTML-Vorschau zu erzeugen benötigt es allerdings ein Plugin wie [sublimetext-markdown-preview](https://github.com/revolunet/sublimetext-markdown-preview). Eine Liste anderen Markdown-Editoren gibt es [hier](https://github.com/karthik/markdown_science/wiki/Tools-to-support-your-markdown-authoring).

## Verwendung

1. Repository klonen `git clone https://...`
2. README bearbeiten `subl README.md`
3. Änderungen einchecken `git add README.md` und committen `git commit -m "Update README"`

## Funktionen

Tipps, um semantische READMEs mit Markdown zu schreiben. Ein vollständige Dokumentation der Funktionen bietet das [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet).

### Textformatierung

Hervorhebungen lassen sich in Markdown folgendermaßen gestalten:

- **Text fett**: `**fett**`
- *Text kursiv*: `*fett*`

Die Überschriften unterscheiden sich jeweils durch die Anzahl der vorangestellten Rauten `## H2`.

### Aufzählungen

Markdown bietet die Möglichkeit verschiedene Aufzählungen anzulegen.

Unsortierte Aufzählungen mit vorangestellten Bindestrichen `-`:

- Listeneintrag
- anderer Listeneintrag
- noch ein Listeneintrag

Sortierte Aufzählung mit vorangestellten Zahlen `1.`:

1. Erster Listeneintrag
2. Zweiter Listeneintrag
3. Dritter Listeneintrag

### Links und Bilder

Links bestehen jeweils aus einem Linktext und einer URL `[Linktext](http://github.com/br-data)`.

Beispiel: [Zur README-Vorlage](https://github.com/digitalegarage/open-source-guidelines/blob/master/README-template.md)

Bilder können nach dem gleichen Prinzip eingebunden werden. Einziger Unterschied ist das führende Ausrufezeichen `![Bildbeschreibung](https://de.wikipedia.org/wiki/Datei:GitHub_logo_2013.svg)`

![Github-Logo](https://de.wikipedia.org/wiki/Datei:GitHub_logo_2013.svg)

### Code

Unformatierte Codefragmente können im Paragraphen mit Backticks `this.function()` angezeigt werden oder als ganze Code-Blöcke mit drei Backticks in der ersten und letzten Zeile. Für passendes Syntax-Highlighting muss in der ersten Zeile die Skriptsprache angegeben werden `javascript`.

Beispiel:

```javascript
function add(a, b) {
  return a+b
}

add(1, 2) // returns 3
```

## Probleme

Manchmal funktioniert der Markdown-Renderer nicht. In diesem Fall hilft meistens ein Neustart des Text-Editors.

## Verbesserungen

- Beispiel-Readme auf Englisch hinzufügen
- Einstellungen im Text-Editor ausführlicher beschreiben

## Quellen

- Philosophie: [Art of README](https://github.com/noffle/art-of-readme)
- Markdown-Beispiele von [Github Markdown](https://guides.github.com/features/mastering-markdown/) und [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
- **Demo:** [Original README-Vorlage bei Github](https://github.com/digitalegarage/open-source-guidelines/blob/master/README-template.md)


---------

## Projektname
Kurze Beschreibung des Projekts.

## Installation
Beschreibung, wie man das Projekt installiert.

## Verwendung
Anleitung, wie man das Projekt benutzt.

## Beitragende
Liste der Beitragenden an diesem Projekt.

## Lizenz
Lizenz, unter der das Projekt veröffentlicht wird.

## Kontakt
Informationen zur Kontaktaufnahme mit dem Projektteam.

## Anmerkungen
Weitere Anmerkungen oder Informationen, die für das Projekt relevant sind.

## Problembehandlung
Liste möglicher Probleme, auf die Benutzer stoßen könnten, sowie Anleitungen, um sie zu beheben.

Wir hoffen, dass diese README-Datei Ihnen dabei helfen wird, Ihr Projekt zu veröffentlichen und zu teilen!


docker run --name myXampp -p 41061:22 -p 41062:80 -d -v ~/my_web_pages:/www tomsik68/xampp:8
http://localhost:41062/dashboard/
https://hub.docker.com/r/tomsik68/xampp/
