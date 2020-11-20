package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Организация
 */

@Entity(name = "Organization")
public class Organization {
    @Id
    private Long id;
    String name;
    String fullOrgName;
    String inn;
    String kpp;
    String address;
    String phone;
    boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_org_name() {
        return fullOrgName;
    }

    public void setFull_org_name(String full_org_name) {
        this.fullOrgName = fullOrgName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
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

    public boolean isIs_active() {
        return isActive;
    }

    public void setIs_active(boolean is_active) {
        this.isActive = is_active;
    }
}
