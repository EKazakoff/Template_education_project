package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

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

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(int doc_number) {
        this.docNumber = docNumber;
    }

    public String getDocData() {
        return docData;
    }

    public void setDocData(String doc_data) {
        this.docData = doc_data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
