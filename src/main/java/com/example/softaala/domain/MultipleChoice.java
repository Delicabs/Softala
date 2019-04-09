package com.example.softaala.domain;

public class MultipleChoice {
    private String optiona;
    private String optionb;
    private String optionc;

    public MultipleChoice(){}

    public MultipleChoice(String optiona, String optionb, String optionc)   {
        this.optiona = optiona;
        this.optionb = optionb;
        this.optionc = optionc;
    }

    public String getOptiona() {
        return optiona;
    }

    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    public String getOptionc() {
        return optionc;
    }

    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    @Override
    public String toString() {
        return "MultipleChoice{" +
                "optiona='" + optiona + '\'' +
                ", optionb='" + optionb + '\'' +
                ", optionc='" + optionc + '\'' +
                '}';
    }
}
