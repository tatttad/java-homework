package week2;

import java.util.Scanner;

/* 30. Write a Java program by using two for loops to produce the output shown below:
       1.Input N natural number, print picture like bellow in size N*N
         ***********
         ***********
         ***********
         ***********
 */
public class Task30 {
    public static void main(String[] args) {
        System.out.println("Please, input N natural number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("N should be natural!");
        } else {
            System.out.println("Here is a " + n + "x" + n + " sized matrix :)");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
