package com.cydeo.solid.dependencyInversion.goodExample;

public class XMLReader implements Reader {

    @Override
    public String getUserName() {
        return "<username>mikesmith</username>";
    }

}
