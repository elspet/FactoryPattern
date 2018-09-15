package com.c4po.pattern.client;

import com.c4po.pattern.factory.AbstractTeaFactory;
import com.c4po.pattern.factory.ConcreteTeaFactory;
import com.c4po.pattern.product.AbstractTeaProduct;
import com.c4po.pattern.product.DianBlackTea;
import com.c4po.pattern.product.QimenBlackTea;
import com.c4po.pattern.product.RouguiWulongTea;

/**
 * function
 * @author Lisa
 * @date 2018/9/15
 */

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
