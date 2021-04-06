package com.company;

public abstract class Shape {

    protected String m_name;

    public Shape(String m_name) {
        this.m_name = m_name;
    }
    public abstract double getArea();
    public abstract double getHekef();

    @Override
    public String toString() {
        return "Shape{" +
                "m_name='" + m_name + '\'' +
                getArea() +
                getHekef() +
                '}';
    }
}
