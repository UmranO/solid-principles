package com.cydeo.solid.dependencyInversion.badExample;

public class UserReader {
    private XMLReader xmlReader;

    public UserReader(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    public String getUsername() {
        return xmlReader.getUsername();
    }

}