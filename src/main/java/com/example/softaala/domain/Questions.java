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


    public Questions(){

    }
    public Questions(String question){
        Question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", Question='" + Question + '\'' +
                '}';
    }
}
