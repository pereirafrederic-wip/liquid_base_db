FROM postgres:9.4

ENV  POSTGRES_PASSWORD liquidbase
ENV  POSTGRES_USER root
ENV  POSTGRES_DB liquidbase
COPY ./init.sql /docker-entrypoint-initdb.d/init.sql