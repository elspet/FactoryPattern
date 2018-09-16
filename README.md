# FactoryPattern
设计模式之工厂模式

[简书"Javaの设计模式之工厂模式"](https://www.jianshu.com/p/91a54409bccf)

**定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到他的子类。**


#### 工厂模式的优点
+ 良好的封装性
+ 扩展性好
+ 可以屏蔽产品类
+ 工厂模式是典型的解耦框架

#### 模式组成：
+ 1、抽象产品类：`AbstractTeaProduct`
+ 2、具体产品类：`QimenBlackTea`、`DianBlackTea`、`RouguiWulongTea`
+ 3、抽象工厂类：`AbstractTeaFactory`
+ 4、具体工厂类：`ConcreteTeaFactory`

本Demo以茶为产品，制茶厂为产品生产者。

#### 一、抽象产品类
```java
public abstract class AbstractTeaProduct   {

    /**
     * 茶汤颜色
     */
    public abstract void teaColor();

    /**
     * 干茶外形
     */
    public abstract void dryTeaShape();

    /**
     * 茶香
     */
    public abstract void teaFlavor();
}
```

#### 二、具体产品类
+ QimenBlackTea
```java
public class QimenBlackTea extends AbstractTeaProduct {

    @Override
    public void teaColor() {
        System.out.println("祁门红茶 - 汤色红艳明亮");
    }

    @Override
    public void teaFlavor() {
        System.out.println("祁门红茶 - 【花香】蕴含着玫瑰花香，香气馥郁持久；滋味甘甜醇厚");
    }

    @Override
    public void dryTeaShape() {
        System.out.println("祁门红茶 - 条索紧细匀整，锋苗秀丽，色泽乌润");
    }
}

```

+ DianBlackTea
```java
public class DianBlackTea extends AbstractTeaProduct {


    @Override
    public void teaColor() {
        System.out.println("滇红 - 汤色红浓透明，金圈显露");
    }

    @Override
    public void teaFlavor() {
        System.out.println("滇红 - 【花果香】香气高纯持久；滋味浓厚鲜爽");
    }

    @Override
    public void dryTeaShape() {
        System.out.println("滇红 - 条索紧直肥壮，苗锋秀丽完整，金毫多而显露，色泽油润");
    }
}

```
#### 三、抽象工厂类
泛型，实现了AbstractTeaProduct抽象类的类都可以作为参数传入。
```java
public abstract class AbstractTeaFactory   {
    public abstract <T extends AbstractTeaProduct>T makeTea(Class<T> tea);
}

```
#### 四、具体工厂类
```java
public class ConcreteTeaFactory extends AbstractTeaFactory {

    @Override
    public <T extends AbstractTeaProduct> T makeTea(Class<T> concreteTea) {
        AbstractTeaProduct tea = null;
        try{
            tea = (AbstractTeaProduct) Class.forName(concreteTea.getName()).newInstance();
        }catch (Exception e){
            // 异常处理
        }
        return (T)tea;
    }
}

```
#### 五、场景类

```java
public class LisaTheCat {
public static void main(String[] args){

        AbstractTeaFactory creator = new ConcreteTeaFactory();
        // 祁门红茶
        AbstractTeaProduct qimenBlackTea = creator.makeTea(QimenBlackTea.class);
        qimenBlackTea.dryTeaShape();
        qimenBlackTea.teaColor();
        qimenBlackTea.teaFlavor();
        System.out.println("---------------");
        // 滇红
        AbstractTeaProduct dianBlackTea = creator.makeTea(DianBlackTea.class);
        dianBlackTea.dryTeaShape();
        dianBlackTea.teaColor();
        dianBlackTea.teaFlavor();
        System.out.println("---------------");
        // 肉桂
        AbstractTeaProduct rouguiWulongTea = creator.makeTea(RouguiWulongTea.class);
        rouguiWulongTea.dryTeaShape();
        rouguiWulongTea.teaColor();
        rouguiWulongTea.teaFlavor();
    }
 }
```