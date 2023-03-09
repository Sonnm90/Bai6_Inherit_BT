package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value side 1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Enter value side 2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Enter value side 3: ");
        triangle.setSide3(sc.nextDouble());

        if (!triangle.checkTriangle()){
            System.out.println("Not a triangle");
        } else {
            System.out.println(triangle);
        }

    }
}
