package com.example.shang.decoratordemo;

/**
 * Created by shang on 2017/12/6.
 */

public class GoodCloth extends Cloth {

    public GoodCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        dressTs(); //  在super的前后调用都行
        super.dressed();
        dressJean();
    }

    private void dressJean() {
        System.out.println("穿着好牛仔裤");
    }

    private void dressTs() {
        System.out.println("穿着好短袖");
    }
}
