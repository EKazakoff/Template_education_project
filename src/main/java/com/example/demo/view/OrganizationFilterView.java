package com.example.demo.view;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Valid
public class OrganizationFilterView {
    private Integer id;

    @NotNull
    private String name;

    private Boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
