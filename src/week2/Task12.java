package week2;

import java.util.Scanner;

/* 12. Given the String variable day holding the name of the weekday Sunday, Monday, etc.
       Set an int variable to 1, 2, etc.
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println("Please input a day of week with capital letter.");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();

        switch (day) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;

            default:
                System.out.println("There is no such day of the week!");
        }

    }
}
