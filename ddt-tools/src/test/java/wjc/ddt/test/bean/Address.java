package wjc.ddt.test.bean;

import java.io.Serializable;

/**
 * Author: 王俊超
 * Date: 2018-01-13 07:12
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class Address implements Serializable {
    private int postcode;
    private String country;
    private String provice;
    private String city;
    private String street;

    public Address() {
    }

    public Address(int postcode, String country, String provice, String city, String street) {
        this.postcode = postcode;
        this.country = country;
        this.provice = provice;
        this.city = city;
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postcode=" + postcode +
                ", country='" + country + '\'' +
                ", provice='" + provice + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
