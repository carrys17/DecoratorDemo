package com.example.shang.decoratordemo;

/**
 * Created by shang on 2017/12/6.
 */

// 抽象装饰类
public abstract class Cloth extends Person {
    protected Person person;

    public Cloth(Person person){
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
