package B3.BaiTap.QuadraticEquationClass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots : " + equation.getRoot1() + "and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root : " + equation.getRoot2());
        } else {
            System.out.println("The equation has no real roots : ");
        }




    }
}
