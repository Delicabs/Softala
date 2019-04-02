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
    private String vaihtoehto2;

    public String getVaihtoehto2() {
        return vaihtoehto2;
    }

    public void setVaihtoehto2(String vaihtoehto2) {
        this.vaihtoehto2 = vaihtoehto2;
    }

    public Questions(){

    }



    public Questions(String question, String vaihtoehto1, String vaihtoehto2) {
        Question = question;
        this.vaihtoehto1 = vaihtoehto1;
        this.vaihtoehto2 = vaihtoehto2;
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

    @Override
    public String toString() {
        return "Questions{" + "id=" + id + ", Question='" + Question + '\'' + ", vaihtoehto1='" + vaihtoehto1 + '\'' + ", vaihtoehto2='" + vaihtoehto2 + '\'' + '}';
    }

}
