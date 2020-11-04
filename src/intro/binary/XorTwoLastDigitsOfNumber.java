package intro.binary;

// Task: You have been given a natural number N, which is not less than 10.
//       Output the result of XOR'ing the two last digits of this number.

import java.util.Scanner;

public class XorTwoLastDigitsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num % 100;
        System.out.println((num / 10) ^ (num % 10));

    }
}
