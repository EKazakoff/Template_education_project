package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "User_document")
public class UserDocument {

    @Id
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
