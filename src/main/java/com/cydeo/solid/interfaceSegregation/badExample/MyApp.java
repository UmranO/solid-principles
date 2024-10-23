package com.cydeo.solid.interfaceSegregation.badExample;
import java.util.List;
import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);

    } //--End of main()-------------------------------------------------------------------------------------------------

    public static void letBirdsFly(List<Bird> birds) {
        for (Bird bird : birds) {
            bird.fly();     // Does nothing for chicken
        }
    }

}
