package com.cydeo.solid.interfaceSegregation.goodExample;

public class Owl implements CanEat, CanWalk, CanFly {        //Since Eagle is able to do all it implements all

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

}
