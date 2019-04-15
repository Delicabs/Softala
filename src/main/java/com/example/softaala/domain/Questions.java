package com.example.softaala.domain;

import javax.persistence.*;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String question;

    @ManyToOne
    @JoinColumn(name = "choiceid")
    private MultipleChoice multiplechoice;

    public Questions(){

    }

    public Questions(String question, MultipleChoice multiplechoice)    {
        this.question = question;
        this.multiplechoice = multiplechoice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        question = question;
    }

    public MultipleChoice getMultiplechoice() {
        return multiplechoice;
    }

    public void setMultiplechoice(MultipleChoice multiplechoice) {
        this.multiplechoice = multiplechoice;
    }
}
