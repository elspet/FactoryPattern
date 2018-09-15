package com.c4po.pattern.product;

/*
<!--祁红-->
<string name="app_main_qimen_tea_color">祁门红茶 - 汤色红艳明亮</string>
<string name="app_main_qimen_tea_flavor">祁门红茶 - 【花香】蕴含着玫瑰花香，香气馥郁持久；滋味甘甜醇厚</string>
<string name="app_main_qimen_dry_tea_shape">祁门红茶 - 条索紧细匀整，锋苗秀丽，色泽乌润</string>
*/

/**
 * 祁门红茶
 *
 * @author Lisa
 * @date 2018/9/15
 */

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
