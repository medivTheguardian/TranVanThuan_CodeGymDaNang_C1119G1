package B5.BaiTap.Resizeable;


public class Circle implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent){
        this.radius += this.radius*percent;
    }

}