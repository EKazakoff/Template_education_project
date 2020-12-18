package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 * The type of Entity is User document.
 */
@Entity(name = "User_document")
public class UserDocument {
    @Id
    private Long id;
    @MapsId("id")
    @OneToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "doc_code")
    private Document document;
    private int docNumber;
    private String docData;

    /**
     * Gets document.
     *
     * @return the document
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets document.
     *
     * @param document the document
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets doc number.
     *
     * @return the doc number
     */
    public int getDocNumber() {
        return docNumber;
    }

    /**
     * Sets doc number.
     *
     * @param doc_number the doc number
     */
    public void setDocNumber(int doc_number) {
        this.docNumber = docNumber;
    }

    /**
     * Gets doc data.
     *
     * @return the doc data
     */
    public String getDocData() {
        return docData;
    }

    /**
     * Sets doc data.
     *
     * @param doc_data the doc data
     */
    public void setDocData(String doc_data) {
        this.docData = doc_data;
    }

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
}
