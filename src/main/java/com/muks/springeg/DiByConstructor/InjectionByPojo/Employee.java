package com.muks.springeg.DiByConstructor.InjectionByPojo;

import com.muks.springeg.commons.Address;

/**
 * Created by 15692 on 16/06/16.
 */
public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee() {System.out.println("def cons");}

    public Employee(int id) {this.id = id;}

    public Employee(String name) {  this.name = name;}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    void showAll(){
        System.out.println(id + " " + name);
        System.out.println(address.toString());
    }
}
