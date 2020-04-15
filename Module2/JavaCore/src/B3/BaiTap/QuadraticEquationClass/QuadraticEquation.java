package B3.BaiTap.QuadraticEquationClass;

public class QuadraticEquation {
    private int a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        return r2;
    }

}
