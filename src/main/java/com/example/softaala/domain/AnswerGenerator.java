package com.example.softaala.domain;

public class AnswerGenerator {
    private Long questionid;
    private String answer;

    public Long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnswerGenerator{" +
                "questionid=" + questionid +
                ", answer='" + answer + '\'' +
                '}';
    }
}
