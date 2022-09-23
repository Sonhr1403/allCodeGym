package Calculate;

import static java.lang.Math.pow;

public class Sqare {
    private double side;

    public Sqare(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return pow(this.side, 2);
    }
}
