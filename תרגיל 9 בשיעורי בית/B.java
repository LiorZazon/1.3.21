package com.company;

public abstract class B extends A{
    @Override
    public void firstMethod(){
        System.out.println("first");
        thirdMethod();
    }

    abstract void thirdMethod();

}
