package com.cydeo.solid.interfaceSegregation.goodExample;
import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

    List<CanFly> birds= new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
  //    birds.add(new Chicken());     // Compiler says that chicken can not fly.


    }
}