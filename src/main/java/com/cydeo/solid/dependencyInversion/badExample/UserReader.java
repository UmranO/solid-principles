package com.cydeo.solid.dependencyInversion.badExample;

public class UserReader {
    private XMLReader xmlReader;                 // What happens if we decide to use JSON format instead of XML format?

    public UserReader(XMLReader xmlReader) {     // We need to add jsonReader in Constructor too
        this.xmlReader = xmlReader;
    }

    public String getUsername() {
        return xmlReader.getUsername();
    }

}