package com.example.demo.view.user;

import javax.validation.constraints.NotNull;

/**
 * The type User filter view.
 */
public class UserFilterView {
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String docCode;
    private String citizenshipCode;
    private Boolean isActive;
    @NotNull
    private Long officeId;

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
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * Gets doc code.
     *
     * @return the doc code
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets doc code.
     *
     * @param docCode the doc code
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /**
     * Gets citizenship code.
     *
     * @return the citizenship code
     */
    public String getCitizenshipCode() {
        return citizenshipCode;
    }

    /**
     * Sets citizenship code.
     *
     * @param citizenshipCode the citizenship code
     */
    public void setCitizenshipCode(String citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
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
     * Gets office id.
     *
     * @return the office id
     */
    public Long getOfficeId() {
        return officeId;
    }

    /**
     * Sets office id.
     *
     * @param officeId the office id
     */
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }
}
