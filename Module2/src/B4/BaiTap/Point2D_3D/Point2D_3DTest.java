package B4.BaiTap.Point2D_3D;

public class Point2D_3DTest {
    public static void main(String[] args) {
        Point2D two = new Point2D();
        System.out.println(two.toString());

        two = new Point2D(2, 8);
        System.out.println(two.toString());


        Point3D three = new Point3D();
        System.out.println(three.toString());

        three = new Point3D(5, 6, 7);
        System.out.println(three.toString());

    }
}
