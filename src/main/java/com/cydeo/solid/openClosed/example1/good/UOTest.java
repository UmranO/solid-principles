package com.cydeo.solid.openClosed.example1.good;

import java.util.Arrays;
import java.util.List;

public class UOTest {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        Rectangle r = new Rectangle(2.0, 1.1);

        List<Shape> l = Arrays.asList(c, r, new Triangle());

        startDrawing(l);
    }

    public static void startDrawing(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}