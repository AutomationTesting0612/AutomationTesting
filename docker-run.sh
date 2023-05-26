#!/usr/bin/env bash

docker build -t selenium-docker .
docker run selenium-docker
docker cp `docker ps -l -q`:/app/target/cucumber-report/report.html docker-html-report.html