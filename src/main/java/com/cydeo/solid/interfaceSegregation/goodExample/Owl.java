package com.cydeo.solid.interfaceSegregation.goodExample;

public class Owl implements CanEat, CanWalk, CanFly {        //Since Eagle is able to do all it implements all

    @Override
    public void eat() {
        System.out.println("Owl Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Owl Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Owl Walking.");
    }

}
