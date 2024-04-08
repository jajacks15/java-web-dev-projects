package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the circle's radius:");
        radius = input.nextDouble();

       System.out.println("The circle's area is " + Circle.getArea(radius));
    }
}
