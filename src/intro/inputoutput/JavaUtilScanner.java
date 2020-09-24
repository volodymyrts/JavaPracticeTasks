package intro.inputoutput;

import java.util.Scanner;

public class JavaUtilScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        Integer num1 = scanner.nextInt();
        System.out.println("First number = " + num1);
        Integer num2 = scanner.nextInt();
        System.out.println("Second number = " + num2);

        System.out.println("Sum of numbers = " + (num1 + num2));
    }
}
