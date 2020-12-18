package com.example.demo.view.organization;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * The type Organization filter view.
 */
@Valid
public class OrganizationFilterView {
    private Integer id;

    @NotNull
    private String name;

    private Boolean isActive;

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
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @param isActive the is active
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
