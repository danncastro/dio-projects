#!/bin/bash

kubectl apply -f ./k8s/deploys/deployment-app.yml --record
kubectl apply -f ./k8s/deploys/deployment-database.yml --record