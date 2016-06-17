package com.muks.spring.springfunc.InheritanceInSpring;

/**
 * Created by 15692 on 16/06/16.
 */
public class Address {
    private String addressLine1,city,state,country;

    public Address(String addressLine1, String city, String state, String country) {
        super();
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String toString(){
        return addressLine1+" "+city+" "+state+" "+country;
    }
}
