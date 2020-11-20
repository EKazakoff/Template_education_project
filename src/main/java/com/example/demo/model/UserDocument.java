package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User_document")
public class UserDocument {

    @Id
    private Long id;
    private int docCode;
    private int docNumber;
    private String docData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDocCode() {
        return docCode;
    }

    public void setDocCode(int docCode) {
        this.docCode = docCode;
    }

    public int getDoc_number() {
        return docNumber;
    }

    public void setDoc_number(int doc_number) {
        this.docNumber = docNumber;
    }

    public String getDoc_data() {
        return docData;
    }

    public void setDoc_data(String doc_data) {
        this.docData = doc_data;
    }
}
