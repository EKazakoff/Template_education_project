package com.example.demo.view;

import javax.validation.constraints.NotNull;

public class OfficeViewFilterOut {
    private String name;

    private Boolean isActive;

    @NotNull
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
