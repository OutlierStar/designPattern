
在上述示例中，我们首先定义了策略接口 Strategy，其中包含了一个 execute() 方法用于执行具体的策略。

然后，我们实现了具体策略类 ConcreteStrategyA 和 ConcreteStrategyB，它们分别实现了 execute() 方法来执行各自的策略逻辑。

接下来，我们定义了上下文类 Context，它持有当前的策略，并提供了 setStrategy() 方法用于设置当前策略，以及 executeStrategy() 方法来触发策略的执行。

在使用示例中，我们创建了上下文对象 context，并将初始策略设置为 strategyA，然后通过调用 executeStrategy() 方法来触发策略的执行。我们可以看到，初始策略为 ConcreteStrategyA，因此输出 "Executing strategy A."。然后，我们将策略切换为 strategyB，再次调用 executeStrategy() 方法，此时输出 "Executing strategy B."。

通过策略模式，我们可以将不同的算法或行为封装在不同的策略类中，并使它们可以相互替换，以达到动态改变对象的行为的目的。策略模式可以提高代码的灵活性和可维护性，避免了大量的条件判断语句，使得代码更加清晰和可扩展。