package com.company;

import lombok.ToString;

@ToString
public class StarterDish extends FoodDish{

    protected boolean m_server_with_wine;

    public StarterDish(String m_description, float m_price, boolean m_server_with_wine) {
        super(m_description, m_price);
        this.m_server_with_wine = m_server_with_wine;
    }

}
