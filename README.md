# **Pattern Name and Classification**
 **Template Method**

# **Intent**

O padrão Strategy serve para definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam

# **Motivation**

Fornecer uma maneira de substituir as preocupações de herança: encapsular o algoritmo em uma classe Strategy separada permite alterá-lo independentemente de seu contexto, tornando-o fácil de alternar, fácil de entender e fácil de estender.

# **Applicability**

Uma exemplo de aplicação que iremos utilizar é a implementação de parte de um game de felinos, onde há como subclasses:

 * Felinos reais;
 * Felinos de brinquedo.

Primeiro é implementado a classe de Felino que possui o aviso de qual felino é e logo após o rugido daquele felino.

Depois da classe principal é implementado as classes de Leao, Leopardo e um Tigre de brinquedo.

Após isso iremos criar um método de corrido onde é definido de acordo com a corrida qual o objetivo daquele felipe.

 * Corrida Curta: com o objetivo bem próximo.
 * Corrida Longa: caso necessário.
 * Corrida de brinquedo: Onde é informado que um brinquedo não corre.

Após toda a implementação necessária iremos definir qual o tipo de corrida para cada felino.

# **Structure**

![Imagem](https://github.com/LucasHOliveira/Trabalho-Strategy/blob/main/Strategy.PNG)

# **Participants**

 * Strategy:  É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. O Contexto usa essa interface para chamar uma das subclasses ConcreteStrategy ou um dos algoritmos definidos.

 * ConcreteStrategy: A classe concreta que herda da Strategy abstrata está definida como as subclasses ConcreteStrategyA, ConcreteStrategyB e ConcreteStrategyA.

 * Context: É aquele que vai acessar um dos algoritmos das subclasses de interface Strategy.

# **Sample Code**

[Link para a pasta do código](https://github.com/LucasHOliveira/Trabalho-TemplateMethod/tree/master/ProjetoTM-Codigo)