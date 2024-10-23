package com.cydeo.solid.liskovSubstitution.good;

import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Square square = new Square();
        square.setSide(4);

//        List<Rectangle> rectangles = Arrays.asList(rectangle, square);    Now since Square doesn't extend Rectangle
//                                                                          anymore this will result in Compile error
//                                                                          So this is a way compiler warning us so we
//                                                                          won't make a mistake like we did in changeHeightAndWidth()
//        changeHeightAndWidth(rectangles);                                 Ex for Liskov Substitution Principle
   }
    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);   // Rectangle H -> 5  - Square H, W -> 5
            rectangle.setWidth(6);    // Rectangle W -> 6  - Square W, H -> 6
            System.out.println(rectangle.getArea() == 30);   // Rectangle Area -> 30
        }                                                    // Square Area -> 36

    }
}

