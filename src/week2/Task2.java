package week2;

import java.util.Scanner;

/*
2. Write java program, which has double type variable(Input variable from console)
    1)Cast double to float,print both variables
    2)Cast float to long, print both variables
    3)Cast long to int, print both variables
    4)Cast int to short, print both results
    5)Cast short to byte, print both results
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doubleNum = scanner.nextDouble();
        float floatNum = (float) doubleNum;
        System.out.println(doubleNum + " " + floatNum);

        float floatNum1 = scanner.nextFloat();
        long longNum = (long) floatNum1;
        System.out.println(floatNum1 + " " + longNum);

        long longNum1 = scanner.nextLong();
        int intNum = (int) longNum1;
        System.out.println(longNum1 + " " + intNum);

        int intNum1 = scanner.nextInt();
        short shortNum = (short) intNum1;
        System.out.println(shortNum + " " + intNum1);

        short shortNum1 = scanner.nextShort();
        byte byteNum = (byte) shortNum1;
        System.out.println(shortNum1 + " " + byteNum);


    }
}
