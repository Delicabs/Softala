package com.example.softaala.domain;

public class MultipleChoice2 extends MultipleChoice {

    private String optiond;
    private String optione;
    private String optionf;

    public MultipleChoice2()    {
        super();
        optiond = "";
        optione = "";
        optionf = "";
    }

    public MultipleChoice2(String optiona, String optionb, String optionc)    {
        super(optiona, optionb, optionc);
        optiond = "";
        optione = "";
        optionf = "";
    }

    public MultipleChoice2(String optiona, String optionb, String optionc, String optiond, String optione, String optionf)    {
        super(optiona, optionb, optionc);
        this.optiond = optiond;
        this.optione = optione;
        this.optionf = optionf;
    }

    public String getOptiond() {
        return optiond;
    }

    public void setOptiond(String optiond) {
        this.optiond = optiond;
    }

    public String getOptione() {
        return optione;
    }

    public void setOptione(String optione) {
        this.optione = optione;
    }

    public String getOptionf() {
        return optionf;
    }

    public void setOptionf(String optionf) {
        this.optionf = optionf;
    }

    @Override
    public String toString() {
        return "MultipleChoice2{" +
                "optiond='" + optiond + '\'' +
                ", optione='" + optione + '\'' +
                ", optionf='" + optionf + '\'' +
                '}';
    }
}
