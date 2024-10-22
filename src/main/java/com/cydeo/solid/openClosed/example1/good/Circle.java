package com.cydeo.solid.openClosed.example1.good;

public class Circle implements Shape {
    private double radius;

    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }

//Constructor'i ben deneyebilmek icin ekledim. C'ninkinde yok
    public Circle(double radius) {
        this.radius = radius;
    }

}
