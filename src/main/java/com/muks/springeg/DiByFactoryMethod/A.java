package com.muks.springeg.DiByFactoryMethod;

/**
 * Created by 15692 on 16/06/16.
 */
public class A {
    private static final A obj=new A();

    private A() {
        System.out.println("private constructor");
    }

    public static A getA(){
        System.out.println("factory method ");
        return obj;
    }

    public void msg(){
        System.out.println("hello user");
    }
}
