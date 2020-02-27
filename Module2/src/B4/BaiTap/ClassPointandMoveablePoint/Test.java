package B4.BaiTap.ClassPointandMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3, 4);
        System.out.println(point);

        MoveablePoint mPoint = new MoveablePoint();
        System.out.println(mPoint);

        mPoint = new MoveablePoint(3, 3, 3, 3);
        System.out.println(mPoint);
        System.out.println(mPoint.move());

    }
}
