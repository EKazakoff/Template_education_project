package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Документ
 */
@Entity(name = "Document")
public class Document {

    @Id
    private Long id;

    private String name;
    private Integer code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
