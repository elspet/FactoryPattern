package com.c4po.pattern.product;


/*
 <!--肉桂-->
    <string name="app_main_rougui_tea_color">肉桂 - 汤色橙红</string>
    <string name="app_main_rougui_tea_flavor">肉桂 - 【桂皮香】香气馥郁，滋味浓烈甘醇、优雅</string>
    <string name="app_main_rougui_dry_tea_shape">肉桂 - 条索紧细、重实，色泽乌黑带砂绿，油润有光</string>
*/

/**
 * 肉桂【乌龙茶】
 *
 * @author Lisa
 * @date 2018/9/15
 */
public class RouguiWulongTea extends AbstractTeaProduct {


    @Override
    public void teaColor() {
        System.out.println("肉桂 - 汤色橙红");
    }

    @Override
    public void teaFlavor() {
        System.out.println("肉桂 - 【桂皮香】香气馥郁，滋味浓烈甘醇、优雅");
    }

    @Override
    public void dryTeaShape() {
        System.out.println("肉桂 - 条索紧细、重实，色泽乌黑带砂绿，油润有光");
    }
}
