package com.cydeo.solid.dependencyInversion.goodExample;

public class UserReader {
    private Reader reader;                      //Instead of making UserReader CLass directly dependent on XMLReader
                                                //Class we need to put an abstraction in between so put Reader reader
                                                //as a field instead of private XMLReader xmlReader;
                                                //Bu sekilde Reader'i implement eden her hangi bir class'dan reader'i
                                                //kullanabilecek hale getirmis oluyoruz.
    public UserReader (Reader reader){          //UserReader class doesn't know anything about XMLReader Class bec
        this.reader=reader;                     //UserReader class doesn't give that info in it.Also Reader interface
    }                                           //doesn't have that info as well.Bu sekilde yeni bir reader yarattiginda
                                                //UserReader Class'da bir degisiklik yapman gerekmiyor:eg field ekle,
                                                //constructor'a ekle ya da getger ekle gibiMLReader knows about Reader
                                                //Interface bec.it implements it

    public String getUsername(){
        return reader.getUserName();
    }
}
