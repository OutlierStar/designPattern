
在上述示例中，我们首先定义了命令接口 Command，其中包含了一个 execute() 方法用于执行命令。

然后，我们实现了具体命令类 ConcreteCommand，它实现了 Command 接口，并持有一个接收者对象 Receiver。在 ConcreteCommand 类中，我们通过调用接收者对象的 action() 方法来执行命令。

接下来，我们定义了接收者类 Receiver，它包含了实际执行命令的方法 action()。

然后，我们定义了调用者类 Invoker，它持有一个命令对象，并通过 setCommand() 方法设置命令。在 executeCommand() 方法中，我们调用命令对象的 execute() 方法来执行命令。

在使用示例中，我们创建了接收者对象 receiver、命令对象 command 和调用者对象 invoker。我们通过调用者对象的 setCommand() 方法将命令对象设置到调用者中，并通过调用者对象的 executeCommand() 方法来执行命令。我们可以看到命令被正确地传递给接收者，并执行了相应的操作。

通过命令模式，我们可以将请求封装成一个对象，以便在不同的上下文中使用、传递和操作。命令模式可以解耦发送者和接收者之间的关系，并提供了一种灵活的方式来设计和扩展功能。