package com.example.demo.model;

import javax.persistence.*;

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
    private String phone;

    @OneToOne
    private UserDocument userDoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenship_code")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id")
    private Office office;

    private Boolean isIdentified;

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserDocument getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(UserDocument userDoc) {
        this.userDoc = userDoc;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Boolean getIdentified() {
        return isIdentified;
    }

    public void setIdentified(Boolean identified) {
        isIdentified = identified;
    }

}
