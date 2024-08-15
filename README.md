
<h1 align="center"> Design Patterns </h1>

<p align="center">
Códigos criado com intuito e aprender design pattern <br/>
</p>

<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-licença">Licença</a>
</p>


<p align="center">
  <img src="https://whimsical.com/design-pattens-TMpov9AnSRSPKBH6sLwC7W" width="100%">
</p>

A ideia dos padrões vem do trabalho de Christopher Alexander na área de arquitetura de cidades e construções. De acordo com  CHRISTOPHER ALEXANDER ”Cada padrão descreve um problema que ocorre freqüentemente em seu ambiente, e então descreve o cerne da solução para aquele problema, de um modo tal que você pode usar esta solução milhões de vezes, sem nunca fazer a mesma coisa repetida”

A disseminação dos padrões na comunidade de desenvolvimento de software iniciou-se com o conhecido livro "Design Patterns: Elements of Reusable ObjectOriented Software” [10]. Ele descrevia soluções de projeto orientado a objetos que são utilizadas até hoje por desenvolvedores de todo mundo. Esse livro também é conhecido como GoF, um acrônimo de Gang of Four, uma referência aos seus quatro autores.

No contexto da programação orientada a objetos, os **padrões de design**, também conhecidos como **design patterns** (do inglês), servem como modelos para estruturas de classes e objetos, fornecendo aos desenvolvedores soluções comprovadas para problemas comuns . O objetivo principal dos padrões de design é **promover a reutilização de código, melhorar a manutenibilidade e a escalabilidade do software, e facilitar a comunicação entre os desenvolvedores**. De forma resumida os design patterns são soluções abrangentes para problemas recorrentes no desenvolvimento de software.

O GoF definiu 23 padrões de design, categorizados em três grupos principais:

**Padrões de Criação**: Estes padrões lidam com a criação de objetos e  instanciação de classes de uma forma que seja flexível e eficiente. Exemplos incluem o Singleton, o Factory Method e o Abstract Factory.

**Padrões de Estrutura**: Estes padrões lidam com a composição de classes ou objetos para formar estruturas maiores. Exemplos incluem o Adapter, o Decorator e o Proxy.

**Padrões de Comportamento**: Estes padrões lidam com a comunicação entre objetos e o comportamento de objetos em tempo de execução. Exemplos incluem o Observer, o Strategy e o Command.


## 🚀 Padrões de Criação
### Factory Method

De acordo com o GOF ”Um padrão que define uma interface para criar um objeto,mas permite às classes decidirem qual classe instanciar.O Factory Method permite a uma classe deferir ainstanciação para subclasses.”

Define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar. É útil quando uma classe não pode antecipar a classe dos objetos que deve criar.

Problemas que o Factory Method resolve: 
- COMO POSSO ESCREVER UM CÓDIGO
ONDE AS CLASSES INSTANCIADAS
POSSAM VARIAR DENTRO DE UMA MESMA
INTERFACE?
- COMO DEIXAR O MEU CÓDIGO
DESACOPLADO DAS CLASSES
CONCRETAS?

### Abstract Factory
De acordo com o GOF “Prover uma interface para criar famílias de objetos
relacionados ou dependentes sem especificar suas
classes concretas.”

O Abstract Factory é um padrão de design que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. 

Em outras palavras, ele permite que você crie objetos que seguem uma determinada interface ou pertencem a uma determinada família de classes sem precisar conhecer as implementações específicas dessas classes.

Problemas que o Abstract Factory resolve: 
- COMO POSSO ESCREVER UM CÓDIGO
ONDE AS CLASSES INSTANCIADAS
POSSAM VARIAR DENTRO DE UMA MESMA
INTERFACE?
- COMO GARANTIR QUE UM CONJUNTO DE
OBJETOS RELACIONADOS (OU
DEPENDENTES) POSSAM SER CRIADOS
MANTENDO O CONTEXTO ÚNICO?

<p align="center">
  Exemplo Antes do Abstract Factory
</p>

<p align="center">
  <img src="./assets/antesAbstractFactory.png" width="100%">
</p>

<p align="center">
  Exemplo Depois do Abstract Factory
</p>

<p align="center">
  <img src="./assets/depoisAbstrctFactory.png" width="100%">
</p>

## :memo:  Referencias 

Esse projeto foi desenvolvido com as seguintes referencias:

- (https://www.udemy.com/course/padroes-de-projeto-em-java-na-pratica/?couponCode=KEEPLEARNING)
- (https://app.rocketseat.com.br/classroom/design-patterns-for-devs/group/design-patterns-for-devs/lesson/design-patterns-4-devs-factory-pattern)

---

Feito com ♥ by Isabelle

