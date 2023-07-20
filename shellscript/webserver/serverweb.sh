#!/bin/bash

#DEFINIÇÕES:
# 1º Restaurar o snapshot criado anteriormente no virtualbox;
# 2º Atualizar o servidor;
# 3º Instalar o Apache2;
# 4º Instalar o unzip;
# 5º Baixar a aplicação disponível no endereço no diretorio /tmp
# 6º Copiar os arquivos da aplicação no diretório padrão do apache;
# 7º Subir arquivo de script para um repostório no GitHub.

echo "Atualizando a instancia e instalando os softwares nescessarios..."
apt-get update -y && apt-get upgrade -y
apt-get install apache2 unzip -y
apt-get autoremove -y


echo "Efetuando o download da aplicação que será gerenciada pelo Apache2..."

cd /tmp
wget https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip
unzip main.zip
cd linux-site-dio-main
cp -R * /var/www/html/