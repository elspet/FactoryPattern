package com.c4po.pattern.factory;

import com.c4po.pattern.product.AbstractTeaProduct;

/**
 * 抽象茶工厂
 * @author Lisa
 * @date 2018/9/15
 */
public abstract class AbstractTeaFactory   {

    public abstract <T extends AbstractTeaProduct>T makeTea(Class<T> tea);
}
