package com.example.demo.view.user;

import javax.validation.constraints.NotNull;

/**
 * The type User view.
 */
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

    private com.example.demo.view.DocView userDoc;

    private com.example.demo.view.CountryView userCountry;

    private boolean isIdentified;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets second name.
     *
     * @return the second name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets second name.
     *
     * @param secondName the second name
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Gets middle name.
     *
     * @return the middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets middle name.
     *
     * @param middleName the middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets office id.
     *
     * @return the office id
     */
    public int getOfficeId() {
        return officeId;
    }

    /**
     * Sets office id.
     *
     * @param officeId the office id
     */
    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets user doc.
     *
     * @return the user doc
     */
    public com.example.demo.view.DocView getUserDoc() {
        return userDoc;
    }

    /**
     * Sets user doc.
     *
     * @param userDoc the user doc
     */
    public void setUserDoc(com.example.demo.view.DocView userDoc) {
        this.userDoc = userDoc;
    }

    /**
     * Gets user country.
     *
     * @return the user country
     */
    public com.example.demo.view.CountryView getUserCountry() {
        return userCountry;
    }

    /**
     * Sets user country.
     *
     * @param userCountry the user country
     */
    public void setUserCountry(com.example.demo.view.CountryView userCountry) {
        this.userCountry = userCountry;
    }

    /**
     * Is identified boolean.
     *
     * @return the boolean
     */
    public boolean isIdentified() {
        return isIdentified;
    }

    /**
     * Sets identified.
     *
     * @param identified the identified
     */
    public void setIdentified(boolean identified) {
        isIdentified = identified;
    }
}
