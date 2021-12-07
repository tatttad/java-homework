package week2;
import java.util.Scanner;
/* 8. Input int values a and b from console
      1)if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
      2)else print all even values between them
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Please input two numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (((a % 7 == 0) || (b % 7 == 0)) && ((a > 0) && (b > 0))) {
            if (a > b) {
                for (int i = b; i <= a; i++) {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
            } else if (a < b) {
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
            } else {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }

        }
    }
}


