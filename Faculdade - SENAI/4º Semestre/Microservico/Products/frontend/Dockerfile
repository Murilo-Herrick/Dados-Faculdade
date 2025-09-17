FROM nginx:alpine

RUN rm /etc/nginx/conf.d/default.conf

COPY nginx.conf /etc/nginx/conf.d/

COPY templates /usr/share/nginx/html
COPY static /usr/share/nginx/html/static