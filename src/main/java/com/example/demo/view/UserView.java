package com.example.demo.view;

public class UserView {

    private int id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String position;
    private String officeId;
    private String phone;
    private DocView userDoc;
    private CountryView userCountry;
    private boolean isIdentified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
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
