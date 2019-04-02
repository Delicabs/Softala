package com.example.softaala.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String Question;
    private String vaihtoehto1;


    public Questions(){

    }



    public Questions(String question, String vaihtoehto1) {
        Question = question;
        this.vaihtoehto1 = vaihtoehto1;
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return Question;
    }

    public String getVaihtoehto1() {
        return vaihtoehto1;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public void setVaihtoehto1(String vaihtoehto1) {
        this.vaihtoehto1 = vaihtoehto1;
    }
}
