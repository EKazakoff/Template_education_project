package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * The type of Entity is Organization.
 */
@Entity(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "full_org_name")
    private String fullName;
    private String inn;
    private String kpp;
    private String address;
    private String phone;
    private Boolean isActive;

    @OneToMany(mappedBy = "organization")
    private List<Office> offices;

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name.
     *
     * @param fullOrgName the full org name
     */
    public void setFullName(String fullOrgName) {
        this.fullName = fullOrgName;
    }

    /**
     * Gets inn.
     *
     * @return the inn
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets inn.
     *
     * @param inn the inn
     */
    public void setInn(String inn) {
        this.inn = inn;
    }

    /**
     * Gets kpp.
     *
     * @return the kpp
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets kpp.
     *
     * @param kpp the kpp
     */
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * Gets is active.
     *
     * @return the is active
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets is active.
     *
     * @param active the active
     */
    public void setIsActive(Boolean active) {
        isActive = active;
    }

    /**
     * Gets offices.
     *
     * @return the offices
     */
    public List<Office> getOffices() {
        return offices;
    }

    /**
     * Sets offices.
     *
     * @param offices the offices
     */
    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }
}
