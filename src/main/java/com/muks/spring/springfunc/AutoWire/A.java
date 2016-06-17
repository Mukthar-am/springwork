package com.muks.spring.springfunc.AutoWire;

/**
 * Created by 15692 on 16/06/16.
 */
public class A {
    B b;

    A() {
        System.out.println("a is created");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    void print(){
        System.out.println("hello a");
    }

    void display(){
        print();
        b.print();
    }
}
