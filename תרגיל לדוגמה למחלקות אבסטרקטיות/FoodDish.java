package com.company;

import lombok.ToString;

@ToString
public abstract class FoodDish {

    protected String m_description;
    protected float m_price;

    public void tellLast3WhoInvitedCourse() {

    }
    public void writeMainIngredients() {

    }

    public FoodDish(String m_description, float m_price) {
        this.m_description = m_description;
        this.m_price = m_price;
    }
}
