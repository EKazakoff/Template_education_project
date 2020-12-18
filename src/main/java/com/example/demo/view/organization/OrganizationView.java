package com.example.demo.view.organization;
import javax.validation.constraints.NotNull;

/**
 * The type Organization view.
 */
public class OrganizationView {

    private int id;

    @NotNull
    private String name;

    @NotNull
    private String fullName;

    @NotNull
    private String inn;

    @NotNull
    private String kpp;

    @NotNull
    private String address;

    private String phone;
    private Boolean isActive;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
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
     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
}
