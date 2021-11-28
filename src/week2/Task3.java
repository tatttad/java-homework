package week2;

import java.util.Scanner;

/*
3 .Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        System.out.println("The area of circle with " + radius + " radius is - " + area  );
        System.out.println("The perimeter of circle with " + radius + " radius is - " + perimeter );
    }
}
