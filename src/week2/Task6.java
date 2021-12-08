package week2;

import java.util.Random;

/* 6. Generate and print random integer number between 2 and 7(not using bound)
 */
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int k = random.nextInt();
        if (k >= 0) {
            k %= 6;
            System.out.println(k + 2);
        } else {
            k *= (-1);
            k %= 6;
            System.out.println(k + 2);
        }

    }
}
