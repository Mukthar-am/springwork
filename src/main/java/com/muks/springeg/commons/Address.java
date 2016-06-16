package com.muks.springeg.commons;

/**
 * Created by 15692 on 16/06/16.
 */
public class Address {

    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString(){
        return city+" "+state+" "+country;
    }
}
