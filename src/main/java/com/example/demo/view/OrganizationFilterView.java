package com.example.demo.view;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Valid
public class OrganizationFilterView {
    @NotNull
    private String name;

    private String inn;

    private Boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
