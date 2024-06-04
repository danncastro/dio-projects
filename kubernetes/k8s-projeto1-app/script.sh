#!/bin/bash

echo "Criação de imagens...."
docker build -t danncastro/k8s-projeto1-app-backend:1.0 backend/.
docker build -t danncastro/k8s-projeto1-app-database:1.0 database/.

echo "Push das imagens..."
docker push danncastro/k8s-projeto1-app-backend:1.0
docker push danncastro/k8s-projeto1-app-database:1.0

echo "Criando volumes..."
kubectl apply -f ./volumes/pv.yml
kubectl apply -f ./volumes/pvc.yml

echo "Criando serviços no K8s..."
kubectl apply -f ./services/services.yml

echo "Subindo Deploys..."
kubectl apply -f ./deploy/deployment-backend.yml
kubectl apply -f ./deploy/deployment-database.yml
