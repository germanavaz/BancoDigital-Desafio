
# Desafio Banco Digital

Projeto proposto no módulo de sintaxe da formação Java Developer da [DIO](https://web.dio.me/), com o objetivo de simular um banco digital. 

Considerando o conhecimento no domínio bancário, foi realizada uma solução orientada a objetos em Java. 

### Domínio/Problema

Considerando o problema, foi interpretado o seguinte cenário:

- O banco oferece aos seus clientes dois tipos de contas (**corrente e poupança**);
- Possuem as funcionalidades de **depósito, saque e transferência** (entre contas da própria instituição);

## Projeto

- Interface **Conta** com os métodos: sacar, depositar, transferir e imprimir extrato;
  - Sacar retorna o valor do saldo menos o valor sacado;
  - Depositar retorna o valor do saldo mais o valor depositado; 
  - Transferir retira o valor do saldo da conta que está transferindo e adiciona em outra;
  - Imprimir extratos retorna o nome do titular da conta, número da conta, agência e saldo. 
- Classe pai **Conta** com valores da agência, conta e saldo. Agência e conta implementados por números sequenciais automaticamente gerados a partir da criação de uma conta;

### Pilares da Orientação a objetos:

- Abstração:

Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando as características menos importantes.  

- Encapsulamento:

Encapsular significa esconder a implementação dos objetos que não fazem sentindo serem expostas. Criando interfaces de uso mais concisas e fáceis de usar e entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução. 

- Herança:

Permite que você defina uma classe filha que herda, estende ou modifica o comportamento de uma classe pai. 

- Polimorfismo:

Capacidade de um objeto poder ser referenciado de várias formas. 




