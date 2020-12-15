package com.example.demo.view;

import javax.validation.constraints.NotNull;

public class UserView {

    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String secondName;

    private String middleName;

    @NotNull
    private String position;

    @NotNull
    private int officeId;

    private String phone;

    private DocView userDoc;

    private CountryView userCountry;

    private boolean isIdentified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DocView getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(DocView userDoc) {
        this.userDoc = userDoc;
    }

    public CountryView getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(CountryView userCountry) {
        this.userCountry = userCountry;
    }

    public boolean isIdentified() {
        return isIdentified;
    }

    public void setIdentified(boolean identified) {
        isIdentified = identified;
    }
}
