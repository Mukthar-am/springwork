package com.muks.spring.springfunc.DiBySetter;

/**
 * Created by 15692 on 16/06/16.
 */
public class Address {
    private String addressLine1;
    private String city;
    private String state;
    private String country;

//getters and setters

    public String toString(){
        return addressLine1+" "+city+" "+state+" "+country;
    }
}
