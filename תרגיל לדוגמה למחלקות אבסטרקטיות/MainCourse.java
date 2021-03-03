package com.company;

public abstract class MainCourse extends FoodDish {

    protected float m_calories;

    public MainCourse(String m_description, float m_price, float m_calories) {
        super(m_description, m_price);
        this.m_calories = m_calories;
    }
}
