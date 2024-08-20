## Desafio de Projejo: Design Patterns com Java

### 📜 Descrição:
Este `Desafio de Projeto` foi proposto pela `DIO - Digital Innovation One` inicialmente em `Santander Bootcamp 2023 - Backend Java` e posteriormente no `Bootcamp Claro - Java com Spring Boot`.

Este Projeto tem o objetivo de explorar os conceitos de `Padrões de Projeto` na prática utilizando a linguagem pura `Java`. É implementado um sistema simples para aplicação de descontos em uma loja, fazendo com que cadas padrão complemente outro, utilizando o `Padrão Criacional` `Singleton` para gerar uma unica instancia de `Gerenciamento de Pedidos`, `Padrão Compotamental` `Strategy` para definir os descontos de 10% e 15% a serem aplicados e `Padrão Estrutural` `Facade` para simplificar a utilização das classes que implementam os padrões `Singleton`e `Strategy`


### ⏯ Como utilizar:

No diretório `src` há a classe principal `Loja.java` para executar o programa e há também os subdiretórios que armazenam cada um dos `design patterns` utilizados. No diretório `singleton` está armazenada a classe `GerenciamentoPedido.java`, no deretório `strategy` há a interface `Desconto.java`, e as classes `DescontoDezPorCento.java` e `DescontoQuinzePorCento.java` que implementam a interface, e no diretório `facade` há a classe `Pedido.java`. 

Na classe principal `Loja.java` é intanciado os diferentes contextos de descontos, um para 10% e outro para 15%, em seguida é instanciado a classe `Pedido.java` que busca a instancia `singleton` `gerenciamento` provida pela classe `GerenciamentoPedido.java`, chamando seu `método` `fazerPedido` com os `argumentos` `valorTotal` do pedido e o objeto `desconto` que deseja aplicar. O `método` `fazerPedido` possui uma `variável` chamada `valorComDesconto` que atribui o contexto específico de `desconto` passado chamando o seu método `aplicarDesconto`, da classe de `strategy`, passando o `valorTotal` como argumento. O `método` `aplicarDesconto` é responsável por calcular e retornar o valor do produto com seu desconto aplicado. 


### 🛠 Tecnologias utilizadas:
<div>
    <img align="center" alt="ssperandio-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" />
    <img align="center" alt="ssperandio-Git" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" />
    <img align="center" alt="ssperandio-GitHub" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" />    
</div>


### 📫 Entre em contato comigo:
<div>
  <a href="https://www.linkedin.com/in/sidneysperandio" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
  <a href = "mailto:dev.ssperandio@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://wa.me/5511975018322" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-WhatsApp-%2325D366?style=for-the-badge&logo=whatsapp&logoColor=white" alt="WhatsApp"></a>
</div>


### 🤝 Contribua:
Sinta-se a vontade para somar com a sua contribuição, basta dar um `fork`.

⭐️ Dê um `star` no projeto.

🐛 Abra uma `issues` para relatar algum problema.
