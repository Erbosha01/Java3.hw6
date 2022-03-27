package com.geektech.java3hw6;

public class Country {
    private int flag;
    private String name;
    private String capital;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
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

    public Country(int flag, String name, String capital) {
        this.flag = flag;
        this.name = name;
        this.capital = capital;
    }
}
