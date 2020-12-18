package com.example.demo.view.office;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * The type Office view.
 */
@Valid
public class OfficeView {
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    private String phone;

    private Boolean isActive;

    @NotNull
    private long orgId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
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
     * Is active boolean.
     *
     * @return the boolean
     */
    public Boolean isActive() {
        return isActive;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(Boolean active) {
        isActive = active;
    }

    /**
     * Gets active.
     *
     * @return the active
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * Gets org id.
     *
     * @return the org id
     */
    public long getOrgId() {
        return orgId;
    }

    /**
     * Sets org id.
     *
     * @param orgId the org id
     */
    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }
}