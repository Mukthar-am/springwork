package com.muks.spring.springfunc.InheritanceInSpring;

/**
 * Created by 15692 on 16/06/16.
 */
public class Employee {
    private int id;
    private String name;
    private Address address;
    public Employee() {}

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println(address);
    }
}
