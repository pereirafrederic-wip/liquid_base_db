FROM postgres:9.4

ENV  POSTGRES_PASSWORD storyline
ENV  POSTGRES_USER root
ENV  POSTGRES_DB storyline
COPY ./init.sql /docker-entrypoint-initdb.d/init.sql