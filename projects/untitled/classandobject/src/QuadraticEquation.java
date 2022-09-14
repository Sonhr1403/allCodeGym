import static java.lang.Math.pow;

public class QuadraticEquation {
    private double a, b, c;
    public double delta;
    public double r1, r2;

    public QuadraticEquation() {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        delta = pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1(){
        if (delta < 0) {
            return 0;
        } else {
            r1 = (-b + pow(delta, 0.5)) / (2 * a);
        }
        return r1;
    }

    public double getRoot2(){
        if (delta < 0) {
            return 0;
        } else {
            r2 = (-b - pow(delta, 0.5)) / (2 * a);
        }
        return r2;
    }
}
