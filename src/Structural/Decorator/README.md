
在上述示例中，我们首先定义了抽象组件接口 Component，其中包含了一个 operation() 方法用于执行组件的操作。

然后，我们定义了具体组件类 ConcreteComponent，它实现了 Component 接口的 operation() 方法。

接下来，我们定义了抽象装饰器类 Decorator，它实现了 Component 接口，并持有一个 Component 对象作为其成员变量。在 Decorator 类中，我们通过委托调用持有的组件对象的 operation() 方法。

然后，我们实现了具体装饰器类 ConcreteDecoratorA 和 ConcreteDecoratorB，它们都继承自 Decorator 类，并在 operation() 方法中调用父类的 operation() 方法后添加额外的操作。

在使用示例中，我们首先创建了一个具体组件对象 component，并调用其 operation() 方法。我们可以看到只有组件自身的操作被执行。

接下来，我们创建了具体装饰器对象 decoratorA 和 decoratorB，它们分别将组件对象作为构造函数的参数传入。通过调用装饰器对象的 operation() 方法，我们可以看到除了组件自身的操作外，装饰器对象还执行了额外的操作。

然后，我们创建了一个装饰器链，将具体装饰器A和具体装饰器B依次包装在组件对象上。同样，通过调用装饰器链的 operation() 方法，我们可以看到装饰器对象的操作按照链式顺序被执行。

通过装饰器模式，我们可以在不改变组件类的情况下，动态地扩展其功能。装饰器模式提供了一种灵活的方式来组合对象，实现功能的动态组合和扩展。