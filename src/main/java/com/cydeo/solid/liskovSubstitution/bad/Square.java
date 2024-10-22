package com.cydeo.solid.liskovSubstitution.bad;

public class Square extends Rectangle{
    @Override                             //Since Square extends it can use the height & width(rectangle's fields & ()s)
    public void setHeight(int height) {   //But it overridden the setters here.
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

}
