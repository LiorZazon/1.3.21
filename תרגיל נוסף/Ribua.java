package com.company;


public class Ribua extends Meruba {

    public Ribua(String m_name, double a) {
        super(m_name, a);
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getHekef() {
        return a * 4;
    }

}
