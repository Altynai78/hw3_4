package com.example.hw3_4;

import java.io.Serializable;

public class Country implements Serializable {
    private String flag;
    private String name;
    private String capital;




    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;

    }
        public Country(String flag, String name, String capital) {
            this.flag = flag;
            this.name = name;
            this.capital = capital;
        }

