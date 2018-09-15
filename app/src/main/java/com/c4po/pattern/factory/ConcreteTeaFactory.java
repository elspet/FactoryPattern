package com.c4po.pattern.factory;

import com.c4po.pattern.product.AbstractTeaProduct;

/**
 * 制茶工厂
 * @author Lisa
 * @date 2018/9/15
 */
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
