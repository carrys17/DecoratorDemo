package com.example.shang.decoratordemo;

/**
 * Created by shang on 2017/12/6.
 */

public class Client {
    public static void main(String []args){
        Person person = new Boy();

        Cloth cloth = new GoodCloth(person);
        cloth.dressed();

        Cloth cloth1 = new BadCloth(person);
        cloth1.dressed();

    }
}
