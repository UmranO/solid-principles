package com.cydeo.solid.dependencyInversion.goodExample;

public class UserReader {
    private Reader reader;                      //Instead of makinfg UserReader CLass directly dependent on XMLReader
                                                //Class we need to put an abstraction in between so put Reader reader
                                                //as a field instead of private XMLReader xmlReader;
                                                //Bu sekilde Reader'i implement eden her hangi bir class'dan reader'i
                                                //kullanabilecek hale getirmis oluyoruz.
    public UserReader (Reader reader){
        this.reader=reader;
    }

    public String getUsername(){
        return reader.getUserName();
    }
}
