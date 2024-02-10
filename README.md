# Sistema de Cadastro de Produtos

Este é um sistema de cadastro de produtos em Java, implementado como exemplo de programação orientada a objetos.

## Funcionalidades

- Cadastro de produtos comuns
- Cadastro de produtos importados, com taxa de importação
- Cadastro de produtos usados, com data de fabricação

## Conceitos e Lógica de Programação Utilizados

### Programação Orientada a Objetos (POO)
- **Encapsulamento:** Utilização de modificadores de acesso (public, private) para controlar o acesso aos atributos das classes.
- **Herança:** As classes `ImportedProducts` e `UsedProducts` estendem a classe `Product`, permitindo a reutilização de código e a especialização de comportamentos.
- **Polimorfismo:** O método `priceTag()` é sobrescrito nas subclasses `ImportedProducts` e `UsedProducts`, permitindo que objetos de diferentes tipos respondam de maneira diferente ao mesmo método.

### Estruturas de Controle
- **Estrutura de Repetição (for):** Utilizada para iterar sobre uma lista de produtos e realizar operações para cada produto.
- **Estrutura de Decisão (if-else):** Utilizada para determinar o tipo de produto (comum, importado ou usado) e realizar ações com base nesse tipo.

### Manipulação de Dados
- **Entrada de Dados:** Utilização da classe `Scanner` para capturar entrada do usuário a partir do console.
- **Formatação de Data:** Utilização da classe `SimpleDateFormat` para formatar a data de fabricação dos produtos.

## Requisitos

- JDK (Java Development Kit) instalado
- Ambiente de desenvolvimento Java (IDE) ou compilador Java

## Como Executar

1. Clone este repositório para o seu ambiente local:

- git clone https://github.com/fernando-felicio/product-information.git


2. Navegue até o diretório do projeto:

- cd product-information


3. Compile o código-fonte:

- javac application/Program.java


4. Execute o programa:

- java application.Program


5. Siga as instruções apresentadas no terminal para cadastrar os produtos.

## Contribuição

- Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

- Livre
