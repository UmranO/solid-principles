package com.cydeo.solid.singleResponsibility.goodExample;

public class SecurityFilter {
    public static boolean authenticate(){
        //Check authentication
        return true;
    }
    public static boolean authorization(){
        //Check authorization
        return true;
    }
}
