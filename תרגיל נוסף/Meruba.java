package com.company;

public abstract class Meruba extends Shape {

    protected double a, b, c, d;

    public Meruba(String m_name, double a, double b, double c, double d) {
        super(m_name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Meruba(String m_name, double a, double c) {
        super(m_name);
        this.a = a;
        this.c = c;
    }

    public Meruba(String m_name, double a) {
        super(m_name);
        this.a = a;
    }

    @Override
    public double getHekef() {
        return a + b + c + d;
    }
    //לא נממש פה מציאת שטח כי אנו לא יודעים איזה מרובע נקבל זה יכול להיות ריבוע או מלבן וכו'
}
