package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Организация
 */

@Entity(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String fullOrgName;
    private String inn;
    private String kpp;
    private String address;
    private String phone;
    private boolean isActive;

    @OneToMany(mappedBy = "organization")
    private List<Office> offices;

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

    public String getFullOrgName() {
        return fullOrgName;
    }

    public void setFullOrgName(String fullOrgName) {
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }
}
