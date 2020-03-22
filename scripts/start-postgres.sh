#!/bin/bash

docker run --name read-your-book-postgres \
-v /tmp/postgresql/data:/var/lib/postgresql/data \
-e POSTGRES_PASSWORD=docker \
-p 5432:5432 -d postgres:12.1-alpine