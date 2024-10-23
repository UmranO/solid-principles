package com.cydeo.solid.interfaceSegregation.goodExample;

public class Eagle implements CanEat, CanWalk, CanFly {        //Since Eagle is able to do all it implements all
    @Override
    public void eat() {
        System.out.println("Eagle Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Eagle Walking.");
    }

}
