package B4.BaiTap.ClassCircleandCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2, "green", 4);
        System.out.println(cylinder);
        System.out.println(((Cylinder) cylinder).getVolume());

    }
}
