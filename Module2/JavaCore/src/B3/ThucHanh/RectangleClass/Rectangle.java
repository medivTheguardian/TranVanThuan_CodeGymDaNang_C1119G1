package B3.ThucHanh.RectangleClass;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
