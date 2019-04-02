package com.example.softaala.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String Answers;

    public Answers() {
    }

    public Answers(String answers) {
        Answers = answers;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswers() {
        return Answers;
    }

    public void setAnswers(String answers) {
        Answers = answers;
    }

    @Override
    public String toString() {
        return "Answers{" + "id=" + id + ", Answers='" + Answers + '\'' + '}';
    }
}
