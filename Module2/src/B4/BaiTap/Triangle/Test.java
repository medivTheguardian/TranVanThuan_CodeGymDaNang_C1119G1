package B4.BaiTap.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of 3 sides of the triangle : ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter color of the triangle : ");
        String color = scanner.nextLine();


        triangle = new Triangle(color, true, side1, side2, side3);

        System.out.println(triangle.toString());
        System.out.println(" Area of the triangle = " + triangle.getArena());
        System.out.println(" Perimeter of the triangle = " + triangle.getPerimeter());


    }
}
