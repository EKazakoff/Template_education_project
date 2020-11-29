package com.example.demo.view;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Valid
public class OfficeView {

    private long id;
    private String name;
    private String orgId;
    private String address;
    private String phone;
    private Boolean isActive;
    private OrganizationView organizationView;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getActive() {
        return isActive;
    }

    public OrganizationView getOrganizationView() {
        return organizationView;
    }

    public void setOrganizationView(OrganizationView organizationView) {
        this.organizationView = organizationView;
    }
}