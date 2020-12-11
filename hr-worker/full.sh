#!/bin/sh
docker rm hr-worker && docker rmi hr-worker:v1 && docker build -t  hr-worker:v1 . && docker container run -p 8001:8001 --name hr-worker --network hr-net --dns=8.8.8.8 hr-worker:v1

