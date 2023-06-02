FROM nginx:latest

COPY index.html /usr/share/nginx/html
COPY map.html /usr/share/nginx/html
COPY cover.css /usr/share/nginx/html
COPY map.css /usr/share/nginx/html
COPY OverPassLayer.bundle.js /usr/share/nginx/html
COPY OverPassLayer.css /usr/share/nginx/html
RUN mkdir /usr/share/nginx/html/js
COPY /js /usr/share/nginx/html/js
