#!/bin/sh
docker run -p 8001:8001 --name hr-worker --network hr-net --dns 8.8.8.8  hr-worker:v1

