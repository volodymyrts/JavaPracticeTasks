package intro.practice;
import java.util.Scanner;

// Task:
// Write a program that reads a three digit number, calculates the new number
// by reversing its digits, and outputs the new number.
public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        int reversed_number = 0;
        System.out.println("Input number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 0) {
            reversed_number = reversed_number * 10 + number % 10;
            number = number / 10;
        }

        System.out.println("Reversed number: " + reversed_number);

    }
}
