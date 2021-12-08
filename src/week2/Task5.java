package week2;

import java.util.Scanner;

/*
5. Write a Java program to allow the user to input his/her age.
    Then the program will show if the person is eligible to vote.
    A person who is eligible to vote must be older than or equal to 18 years old.
*/
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please input your age :)");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You're eligible to vote.");
        } else {
            System.out.println("You aren't eligible to vote.");
        }
    }
}
