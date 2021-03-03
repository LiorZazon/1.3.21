package com.company;

public class Motorcycle extends Vehicle {

    protected float m_hand_break_size;

    public Motorcycle(int m_numberOfWheels, String m_model, float m_hand_break_size) {
        super(m_numberOfWheels, m_model);
        this.m_hand_break_size = m_hand_break_size;
    }

    @Override
    public int getMaxNumOfPassengers() {
        return 6;
    }
    @Override
    public int getMaxSpeed() {
        return 210;
    }
}
