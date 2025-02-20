# Driving-school-2-kata

Este projeto é um exemplo de cálculo do valor de uma aula de direção com base no tempo de aula fornecido pelo usuário.
Link do kata: https://www.codewars.com/kata/589b1c15081bcbfe6700017a/java

## Estrutura do Projeto

- `Kata.java`: Contém a lógica principal para calcular o valor da aula de direção.

## Como Executar

1. Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
2. Compile o arquivo `Kata.java`:
    ```sh
    javac Kata.java
    ```
3. Execute o programa:
    ```sh
    java Kata
    ```
    
## Funcionalidades

- Solicita ao usuário o tempo de aula em minutos.
- Calcula o valor da aula com base nas seguintes regras:
  - Se o tempo de aula for até 65 minutos, o valor é R$ 30,00.
  - Se o tempo de aula for 65 ou 95 minutos, o valor é R$ 30,00.
  - Para tempos maiores, o valor é calculado adicionando R$ 10,00 a cada 30 minutos adicionais.

## Exemplo de Uso

Ao executar o programa, você verá uma mensagem solicitando o tempo de aula:

Digite o tempo de aula em minutos e pressione Enter. O programa calculará e exibirá o valor da aula.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
