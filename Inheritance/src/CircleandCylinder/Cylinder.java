package CircleandCylinder;

public class Cylinder  extends Circle {
    private double height = 1;
    private double volume;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double Volume() {
        setArea();
        return volume = getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius = " + getRadius() + ", color " + getColor() +
                ", height = " + height + ", volume = " + Volume() +
                '}';
    }
}
