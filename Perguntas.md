## 5.2 - Qual design de projeto é melhor? Herança ou composição? Justifique a sua resposta.

A composição. Porque promove um design mais flexível e modular. Na composição, uma classe contém objetos de outras classes (relacionamento "tem um"), o que permite maior reutilização e menos acoplamento entre as classes.


## 1- Qual a diferença entre polimorfismo em tempo de execução e polimorfismo em tempo de compilação? Por que um é chamado de estático e o outro de dinâmico? Dê exemplos de cada tipo (diferentes dos que usamos em aula).

O polimorfismo estático ocorre quando existe sobrecarga de método, onde o método a ser chamado é selecionado em tempo de compilação com base nos argumentos passados ​​ao método. Em outras palavras, o compilador decide qual versão de um método usar com base no número ou tipos de argumentos fornecidos. O polimorfismo dinâmico, por outro lado, ocorre quando um método é selecionado em tempo de execução, dependendo do tipo real do objeto em tempo de execução.

## 2- Explique com suas palavras a diferença entre herança, composição e agregação. Crie um exemplo de cada em Java e inclua numa pasta separada assim como fez com os exercícios da lista.

A herança é usada para modelar uma relação entre duas classes, onde uma classe filha herda comportamentos e características de uma classe pai. Ela representa uma generalização de uma classe mais específica. Já a composição é usada para modelar uma relação entre duas classes onde uma classe contém uma instância de outra classe.