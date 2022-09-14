package Calculate;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*pow(this.radius, 2);
    }

    public double getPerimeter() {
        return PI*2*this.radius;
    }
}
