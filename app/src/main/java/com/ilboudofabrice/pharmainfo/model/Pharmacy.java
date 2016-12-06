package com.ilboudofabrice.pharmainfo.model;

import java.io.Serializable;

/**
 * Created by fabrice on 2016-09-29.
 */
public class Pharmacy implements Serializable {
    private int id;
    private String name;
    //private String mainDoctors;
    private String address;
    private String phone;
    private String group;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
