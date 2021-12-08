package week2;

import java.util.Scanner;

/* 9. Given coordinates of two points in the coordinate plane.
      Write java program to check if the points lie in the same plane?(quarter)
      1)Print In the same quarter, else print Not in the same quarter.
      2)Input 4 coordinates from console, all 4 coordinates != 0.
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input coordinates of first point");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Please input coordinates of second point");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        if ((x > 0) && (y > 0)) {
            if ((x1 > 0) && (y1 > 0)) {
                System.out.println("Two points are in the same first quarter");
            } else {
                System.out.println("Two points are not in the same quarter");
            }
        }
        if ((x < 0) && (y > 0)) {
            if ((x1 < 0) && (y1 > 0)) {
                System.out.println("Two points are in the same second quarter");
            } else {
                System.out.println("Two points are not in the same quarter");
            }
        }
        if ((x > 0) && (y < 0)) {
            if ((x1 > 0) && (y1 < 0)) {
                System.out.println("Two points are in the same third quarter");
            } else {
                System.out.println("Two points are not in the same quarter");
            }
        }
        if ((x < 0) && (y < 0)) {
            if ((x1 < 0) && (y1 < 0)) {
                System.out.println("Two points are in the same fourth quarter");
            } else {
                System.out.println("Two points are not in the same quarter");
            }
        }
    }
}