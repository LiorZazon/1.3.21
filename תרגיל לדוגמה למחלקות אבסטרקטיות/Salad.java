package com.company;

import lombok.ToString;

@ToString
public class Salad extends MainCourse {

    protected String m_vegtabales;

    public Salad(String m_description, float m_price, float m_calories, String m_vegtabales) {
        super(m_description, m_price, m_calories);
        this.m_vegtabales = m_vegtabales;
    }
}
