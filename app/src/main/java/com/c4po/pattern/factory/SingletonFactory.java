package com.c4po.pattern.factory;

import com.c4po.pattern.product.Singleton;

import java.lang.reflect.Constructor;

/**
 * 利用工厂模式实现单例模式
 * @author Lisa
 * @date 2018/9/16
 */

public class SingletonFactory  {

    private static Singleton singleton;

    static {
        try {
            Class myClass = Class.forName(Singleton.class.getName());
            Constructor constructor = myClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();

        }catch (Exception e){
            System.out.println("some exception");
        }
    }

    public static  Singleton getSingleton(){
        return singleton;
    }

}
