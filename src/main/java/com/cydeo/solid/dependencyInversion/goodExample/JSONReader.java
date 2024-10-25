package com.cydeo.solid.dependencyInversion.goodExample;

public class JSONReader implements Reader{
     /*
        Example JSON:

        {
            "username": "mikesmith"
        }
     */

    @Override
    public String getUserName() {
        return "{\"username\": \"mikesmith\"}";
    }

}
