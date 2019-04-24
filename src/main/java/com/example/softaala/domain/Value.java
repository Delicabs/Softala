package com.example.softaala.domain;

import javax.persistence.*;

@Entity
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String option1, option2, option3;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question")
    private Question question;

    public Value(){

    }

    public Value(String option1, String option2, String option3){
        super();
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;


    }

    public Value(String option1, String option2, String option3, Question queston){
        super();
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.question = queston;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
