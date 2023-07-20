#!/bin/bash
# Definições:
# 1° Excluir diretórios, arquivos, grupos e usuários criados anteriormente;
# 2° Todo provisionamento deve ser feito em um arquivo do tipo 'BASH SRIPT';
# 3° O dono de todos os diretórios criados será o usuário root;
# 4° Todos os usuários terão permissão total dentro do diretório 'publico';
# 5° Os usuários de cada grupo terão permissão total dentro de seu respectivo diretório;
# 6° Os usuários não poderão ter permissão de leitura, escrita e execução em diretórios de departamentos que eles não pertencem;
# 7° Subir arquivo de script criado para a sua conta no GitHub.

# DIRETÓRIOS
# /publico #
#/adm #         /ven #          /sec

# GRUPOS:
# GPR_ADM #     GRP_VEN #       GRP_SEC

# USUÁRIOS:
# carlos        debora          josefina
# maria         sebastiana      amanda
# joao          roberto         rogerio

echo "Criando diretorios..."
mkdir /public
mkdir /administrative
mkdir /sales
mkdir /security
echo ''
echo '#############################################################################'
echo ''

echo "Criando grupos de usuários..."
groupadd GRP_ADM
groupadd GRP_SALES
groupadd GRP_SEC
echo ''
echo '#############################################################################'
echo ''

echo "Criando usuários pertencentes ao grupo ADM"
useradd carlos -m -G GRP_ADM
useradd maria -m -G GRP_ADM
useradd joao -m -G GRP_ADM
echo ''
echo '#############################################################################'
echo ''

echo "Criando usuários pertencentes ao grupo SALES"
useradd debora -m -G GRP_SALES
useradd sebastiana -m -G GRP_SALES
useradd roberto -m -G GRP_SALES
echo ''
echo '#############################################################################'
echo ''

echo "Criando usuários pertencentes ao grupo SEC"
useradd josefina -m -G GRP_ADM
useradd amanda -m -G GRP_ADM
useradd rogerio -m -G GRP_ADM
echo ''
echo '#############################################################################'
echo ''

echo "Especificando o dono dos diretórios"
chown root:GRP_ADM /administrative
chown root:GRP_SALES /sales
chown root:GRP_SEC /security
echo ''
echo '#############################################################################'
echo ''

echo "Atribuindo permissões aos diretórios"
chmod 770 /administrative
chmod 770 /sales
chmod 770 /security
chmod 777 /public
echo ''
echo '#############################################################################'
echo ''

echo "Validando as criações"
echo "USUÁRIOS"
cat /etc/passwd | grep "/home"
echo ''
echo '#############################################################################'
echo ''

echo "GRUPOS"
ls -l / | grep "GRP"