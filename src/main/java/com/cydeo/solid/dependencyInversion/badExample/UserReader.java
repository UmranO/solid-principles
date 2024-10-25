package com.cydeo.solid.dependencyInversion.badExample;

public class UserReader {
    private XMLReader xmlReader;                 // What happens if we decide to use JSON format instead of XML format?
    //private JSonReader jsonReader;

    public UserReader(XMLReader xmlReader) {     // We need to add jsonReader in Constructor too

        this.xmlReader = xmlReader;
    }

    public String getUsername() {                // public String getUsernameFromXML()
        return xmlReader.getUsername();
    }
//    public String getUsernameFromJSON() {      //We should add a method to get the other format
//        return jsonReader.getUsername();
//    }

}