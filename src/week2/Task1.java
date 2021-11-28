package week2;
import java.util.Scanner;
/*
1.Write java program, which has byte type variable(Input variables from console)
    1)Cast byte to short type, print both variables
    2)Cast short to int type, print both variables
    3)Cast int to long, print both variables
    4)Cast long to float, print both variables
    5)Cast float to double type, print both variables
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte byteNum = scanner.nextByte();
        short shortNum = byteNum;
        System.out.println(byteNum + " " + shortNum);

        short shortNum1 = scanner.nextShort();
        int intNum = shortNum1;
        System.out.println(shortNum1 + " " + intNum);

        int intNum1 = scanner.nextInt();
        long longNum = intNum1;
        System.out.println(intNum1 + " " + longNum);

        long longNum1 = scanner.nextInt();
        float  floatNum = longNum1;
        System.out.println(longNum1 + " " + floatNum);

        float floatNum1 = scanner.nextInt();
        double  doubleNum = floatNum1;
        System.out.println(floatNum1 + " " + doubleNum);

    }
}
