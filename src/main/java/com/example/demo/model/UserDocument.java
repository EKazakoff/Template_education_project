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
}
