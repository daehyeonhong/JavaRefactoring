package me.whiteship.refactoring._06_mutable_data._18_split_variable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle {

    private final Logger log = LoggerFactory.getLogger(Rectangle.class);
    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        final double calculationPerimeter = 2 * (height + width);
        log.info("perimeter: {}", calculationPerimeter);
        this.perimeter = calculationPerimeter;

        final double calculationArea = height * width;
        log.info("Area: {}", calculationArea);
        this.area = calculationArea;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
