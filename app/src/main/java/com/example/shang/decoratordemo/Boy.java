package com.example.shang.decoratordemo;

/**
 * Created by shang on 2017/12/6.
 */

// 具体组件（被装饰者）
public class Boy extends Person {
    @Override
    public void dressed() {
        System.out.println("基本的装扮");
    }
}
