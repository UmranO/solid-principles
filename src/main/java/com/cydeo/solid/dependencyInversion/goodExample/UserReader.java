package com.cydeo.solid.dependencyInversion.goodExample;

public class UserReader {
    private Reader reader;                      //Instead of makinfg UserReader CLass directly dependent on XMLReader
                                                //Class we need to put an abstraction in between so put Reader reader
                                                //as a field instead of private XMLReader xmlReader;
}
