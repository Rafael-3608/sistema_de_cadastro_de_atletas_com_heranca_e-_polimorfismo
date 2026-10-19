# Sistema de Gerenciamento de Atletas em Java

Este projeto consiste em um sistema orientado a objetos desenvolvido em Java, focado na implementação prática de Herança, Polimorfismo e Regras de Negócio Personalizadas para diferentes modalidades esportivas.

# Funcionalidades e Conceitos Aplicados

Superclasse (Atleta): Abstrai os atributos fundamentais comuns a todo atleta (nome e idade), além de definir o método base de identificação.

Especialização por Modalidade (Classes Filhas):

AtletaCorrida: Lógica de classificação baseada em perfil físico/explosão (Sprinter Leve vs. Sprinter Potência).

AtletaJudo: Determinação automática da categoria de peso oficial do tatame (ex: Ligeiro / Meio-Leve).

AtletaNatacao: Categorização por faixa etária (Junior, Sênior, Master).

Polimorfismo e Reuso (@Override / super): Sobrescrita dos métodos de execução para integrar os dados genéricos da superclasse com comportamentos específicos de cada modalidade.

# 🛠️ Tecnologias Utilizadas

Linguagem: Java (JDK 8 ou superior)

IDE: Visual Studio Code

Controle de Versão: Git / GitHub

# Como Executar o Projeto

Pré-requisitos

Certifique-se de ter o JDK instalado em sua máquina.

Passos

Clone este repositório:

git clone https://github.com/Rafael-3608/SISTEMA-ATLETAS-JAVA.git


Navegue até a pasta do projeto e compile os arquivos .java:

javac *.java


Execute a classe principal Main:

java Main


# Exemplo de Saída no Terminal

Nome do atleta é: Jack
Idade do atleta é: 26
Modalidade - Corrida dos 100 metros

Peso do(a) atleta: 75.5
Sprinter Potência
Gênero do(a) atleta: Masculino
Corredor(a) está correndo!

--------------------------------------------------

Nome do atleta é: Maria
Idade do atleta é: 22
Modalidade - Judô

Peso do(a) atleta: 64.2
Categoria peso Ligeiro/ Meio-Leve
Gênero do(a) atleta: Feminino
Lutador(a) subiu no tatame e está lutando!

--------------------------------------------------

Nome do atleta é: Ana
Idade do atleta é: 26
Modalidade - Natação

Peso do(a) Atleta: 68.4
Nadador(a) Sênior
Gênero do(a) atleta: Feminino
nadador(a) está nadando na piscina dos 100 metro rasos!
