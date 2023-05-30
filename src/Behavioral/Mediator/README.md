
在上述示例中，我们首先定义了中介者接口 Mediator，其中包含了一个 sendMessage() 方法用于发送消息给同事对象。

然后，我们实现了具体中介者类 ConcreteMediator，它维护了一个同事对象列表，并通过 addColleague() 方法添加同事对象。在 sendMessage() 方法中，它会遍历所有的同事对象（除了消息发送者），并调用同事对象的 receiveMessage() 方法来接收消息。

接下来，我们定义了抽象同事类 Colleague，它持有一个中介者对象，并提供了 send() 方法用于发送消息，并要求具体的同事类实现 receiveMessage() 方法来接收消息。

然后，我们实现了具体同事类 ConcreteColleague1 和 ConcreteColleague2，它们分别继承了抽象同事类 Colleague。在具体同事类中，它们通过中介者对象的 sendMessage() 方法发送消息，并在 receiveMessage() 方法中接收消息。

在使用示例中，我们创建了中介者对象 mediator，具体同事对象 colleague1 和 colleague2。我们将同事对象添加到中介者中，然后通过具体同事对象的 send() 方法发送消息。我们可以看到消息被中介者正确地传递给了接收方的具体同事对象，并被打印输出。

通过中介者模式，我们可以通过中介者对象来解耦一组对象之间的交互，使它们之间的通信更加简单和灵活。中介者模式可以集中管理和控制对象之间的交互逻辑，并提供一种松耦合的方式来组织和管理相关对象。