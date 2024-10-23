package com.cydeo.solid.interfaceSegregation.badExample;

public class Chicken implements Bird {

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {                                    //Since Chicken can't fly it should NOT implement Bird
        // Can not fly, so do nothing.
    }

}
