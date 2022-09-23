package Circle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private double radius = 1;
    private String color = "blue";
    private boolean isFilled = false;
    private double  area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = PI*pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + isFilled +
                '}';
    }
}
