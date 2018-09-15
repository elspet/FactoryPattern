package com.c4po.pattern.product;

/*
<!--滇红-->
<string name="app_main_dian_tea_color">滇红 - 汤色红浓透明，金圈显露</string>
<string name="app_main_dian_tea_flavor">滇红 - 【花果香】香气高纯持久；滋味浓厚鲜爽</string>
<string name="app_main_dian_dry_tea_shape">滇红 - 条索紧直肥壮，苗锋秀丽完整，金毫多而显露，色泽油润</string>
*/


/**
 * 滇红
 *
 * @author Lisa
 * @date 2018/9/15
 */
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
