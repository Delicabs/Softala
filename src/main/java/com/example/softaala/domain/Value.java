package com.example.softaala.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "values")
    private List<Question> question;

    public Value(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Value(String value){
        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
