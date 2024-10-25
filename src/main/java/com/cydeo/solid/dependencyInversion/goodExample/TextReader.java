package com.cydeo.solid.dependencyInversion.goodExample;

public class TextReader implements Reader {

    @Override
    public String getUserName() {
        return "mikesmith";
    }

}