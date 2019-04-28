package com.example.softaala.domain;

import javax.persistence.*;

@Entity
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type, option;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question")
    private Question question;

    public Value(){

    }

    public Value(String type){
        super();
        this.type = type;
        this.option = option;




    }

    public Value(Question queston,String type, String option){
        super();
        this.type = type;
        this.option = option;
        this.question = queston;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
