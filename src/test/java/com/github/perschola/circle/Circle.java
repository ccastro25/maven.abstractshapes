package com.github.perschola.circle;

import com.github.perschola.Polygon;
import com.github.perschola.Shape;


/**
 * Created by leon on 12/17/2019.
 */
public class Circle  extends Polygon implements Shape {

    Integer diameter;
    public Circle(Integer diameter) {
        this.diameter = diameter;
    }
    public Circle(){}

    @Override
    public String getDimensions() {
        return String.format("My dimensions are (3.14 * %s squared",this.diameter.toString());
    }

    @Override
    public Integer getHeight() {
        return null;
    }

    @Override
    public Integer getWidth() {
        return null;
    }
}
