package com.c4po.pattern.factory;

import com.c4po.pattern.product.AbstractTeaProduct;

/**
 * 简单工厂模式【静态工厂模式】
 * 简化了工厂模式，虽然扩展起来比较困难，但是非常实用
 * 我设想的是，有些类的实例化需要做比较多的初始化工作，放到工厂中做对象创建操作比较规整。
 * @author Lisa
 * @date 2018/9/16
 */
public class SimpleTeaFactory{

    public static <T extends AbstractTeaProduct> T makeTea(Class<T> concreteTea) {
        AbstractTeaProduct tea = null;
        try{
            tea = (AbstractTeaProduct) Class.forName(concreteTea.getName()).newInstance();
        }catch (Exception e){
            // 异常处理
        }
        return (T)tea;
    }
}
