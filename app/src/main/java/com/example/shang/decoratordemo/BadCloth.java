package com.example.shang.decoratordemo;

/**
 * Created by shang on 2017/12/6.
 */

public class BadCloth extends Cloth {

    public BadCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        dressTs(); //  在super的前后调用都行
        super.dressed();
        dressJean();
    }

    private void dressJean() {
        System.out.println("穿着破牛仔裤");
    }

    private void dressTs() {
        System.out.println("穿着破短袖");
    }
}
