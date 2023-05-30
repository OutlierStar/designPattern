
在上述示例中，我们首先定义了享元工厂 FlyweightFactory，它维护了一个享元对象的池（flyweights），根据需要创建并缓存享元对象。在获取享元对象时，如果对象已经存在于池中，则直接返回，否则创建一个新的享元对象并添加到池中。

然后，我们定义了抽象享元接口 Flyweight，其中包含了一个 operation() 方法用于执行享元对象的操作。

接下来，我们实现了具体享元类 ConcreteFlyweight，它实现了 Flyweight 接口，并持有一个关键字（key）作为其状态。在 ConcreteFlyweight 类中，我们通过 operation() 方法输出享元对象的关键字。

在使用示例中，我们首先创建了享元工厂对象 flyweightFactory。然后，我们通过工厂对象获取三个享元对象：flyweight1、flyweight2和flyweight3。我们可以看到 flyweight1 和 flyweight3 的关键字相同，这是因为它们都是通过相同的关键字 "key1" 获取的。我们输出了每个享元对象的关键字，并验证了 flyweight1 和 flyweight3 是同一个对象。

通过享元模式，我们可以共享细粒度的对象，以节省内存和提高性能。享元模式通过共享相同的状态，减少了需要创建的对象数量，并且可以在不同的上下文中共享对象。