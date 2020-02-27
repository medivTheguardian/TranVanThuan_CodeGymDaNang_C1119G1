package B5.ThucHanh.InterfaceComparator;

import B4.BaiTap.ClassCircleandCylinder.Circle;

public class CircleComparator implements Comparable<Circle> {
    @Override
    public int compareTo(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else return 0;

    }
