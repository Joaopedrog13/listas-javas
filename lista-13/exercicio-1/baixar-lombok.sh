#!/bin/bash
# Baixa o Lombok para a pasta lib (rode uma vez no Codespace)
mkdir -p "$(dirname "$0")/lib"
curl -L -o "$(dirname "$0")/lib/lombok.jar" https://repo1.maven.org/maven2/org/projectlombok/lombok/1.18.34/lombok-1.18.34.jar
echo "Lombok salvo em lib/lombok.jar"
