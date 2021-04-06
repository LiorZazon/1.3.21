package com.company;

public class Malben extends Meruba{

    public Malben(String m_name, double a, double c) {
        super(m_name, a, c);
    }
    @Override
    public double getArea(){
        return a * c;
    }
    @Override
    public double getHekef(){
        return (a * 2) + (c * 2);
    }

}
