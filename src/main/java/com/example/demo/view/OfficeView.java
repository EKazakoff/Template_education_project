package com.example.demo.view;

import javax.validation.constraints.NotNull;

public class OfficeView {
    public int id;
    @NotNull
    public String name;
    @NotNull
    public String orgId;
    public String address;
    public String phone;
    public boolean isActive;
}