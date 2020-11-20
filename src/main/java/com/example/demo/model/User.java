package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Пользователь
 */
@Entity(name = "User")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String position;
    private String officeId;
    private int phone;
    private int userDocId;
    private int citizenshipCode;
    private Boolean isIdentified;

    /**
     * Конструктор для hibernate
     */
    public User() {
    }

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

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getUserDocId() {
        return userDocId;
    }

    public void setUserDocId(int userDocId) {
        this.userDocId = userDocId;
    }

    public int getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(int citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

}
