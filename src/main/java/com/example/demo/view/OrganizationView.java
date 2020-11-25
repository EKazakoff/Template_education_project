package com.example.demo.view;

import java.util.List;

public class OrganizationView {

    private int id;
    private String name;
    private String fullOrgName;
    private String inn;
    private String kpp;
    private String address;
    private String phone;
    private boolean isActive;
    private List<OfficeView> offices;

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

    public List<OfficeView> getOffices() {
        return offices;
    }

    public void setOffices(List<OfficeView> offices) {
        this.offices = offices;
    }
}
