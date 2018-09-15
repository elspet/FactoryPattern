# FactoryPattern
设计模式之工厂模式

定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到他的子类。

本Demo以茶为产品，制茶厂为产品生产者。

模式组成：
+ 1、抽象产品类：`AbstractTeaProduct`
+ 2、具体产品类：`QimenBlackTea`、`DianBlackTea`、`RouguiWulongTea`
+ 3、抽象工厂类：`AbstractTeaFactory`
+ 4、具体工厂类：`ConcreteTeaFactory`
