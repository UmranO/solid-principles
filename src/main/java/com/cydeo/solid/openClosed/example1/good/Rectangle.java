package com.cydeo.solid.openClosed.example1.good;

public class Rectangle implements Shape{
    private double height;
    private double width;

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }

//----------------------------------------------------------------------------------------------------------------------
//Constructor'i ben deneyebilmek icin ekledim. C'ninkinde yok
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
}
