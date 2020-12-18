package com.example.demo.view.office;

import javax.validation.constraints.NotNull;

/**
 * The type Office filter view.
 */
public class OfficeFilterView {
    private String name;
    private String phone;
    private Boolean isActive;
    @NotNull
    private Long orgId;

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
     * Gets active.
     *
     * @return the active
     */
    public Boolean getActive() {
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
     * Gets org id.
     *
     * @return the org id
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * Sets org id.
     *
     * @param orgId the org id
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
