package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Square extends Polygon implements Shape,Rectangle {
    private Integer width;
    public Square(Integer width) {
        this.width = width;
    }
    public Square(){}

    @Override
    public Integer getHeight() {
        return null;
    }

    @Override
    public Integer getWidth() {
        return null;
    }

    @Override
    public String getDimensions() {
        return null;
    }
}
