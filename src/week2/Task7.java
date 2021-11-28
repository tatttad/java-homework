package week2;
import java.util.Scanner;
/* 7. Input from console int a and int b,
      if a and b corresponds for following requirements print “Both a and b legal”,
      if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
        1)a > 10 and b is not equal to 10
        2)both a and b is positive
        3)both a and b is negative
        4)a > 10 b < 1 both of them are odd
        5)a is a multiple of 5 OR b is a multiple of 5
        6)a is not a multiple of 5 but b is a multiple of 5
*/
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Input a and b");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a > 10) && (b != 10)) {
            System.out.println("Both a and b are legal");
        } else if ((a > 10) && (b == 10)) {
            System.out.println("a is legal, b is illegal");
        } else if ((a < 10) && (b != 10)) {
            System.out.println("a is illegal, b is legal");
        } else {
            System.out.println("both of them are illegal");
        }

        System.out.println("Input a and b");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((c > 0) && (d > 0)){
            System.out.println("Both a and b are legal");
        } else if ((c > 0) && (d < 0)) {
            System.out.println("a is legal, b is illegal");
        } else if ((c < 0) && (d > 0)) {
            System.out.println("a is illegal, b is legal");
        } else {
            System.out.println("both of them are illegal");
        }

        System.out.println("Input a and b");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if ((m < 0) && (n < 0)){
            System.out.println("Both a and b are legal");
        } else if ((m < 0) && (n > 0)) {
            System.out.println("a is legal, b is illegal");
        } else if ((m > 0) && (n < 0)) {
            System.out.println("a is illegal, b is legal");
        } else {
            System.out.println("both of them are illegal");
        }

        System.out.println("Input a and b");
        int k = scanner.nextInt();
        int l = scanner.nextInt();

        if ((k < 0) && (l < 0)){
            System.out.println("Both a and b are legal");
        } else if ((k < 0) && (l > 0)) {
            System.out.println("a is legal, b is illegal");
        } else if ((k > 0) && (l < 0)) {
            System.out.println("a is illegal, b is legal");
        } else {
            System.out.println("both of them are illegal");
        }



    }
}
