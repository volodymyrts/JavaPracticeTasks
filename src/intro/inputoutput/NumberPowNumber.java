package intro.inputoutput;

import java.util.Scanner;

public class NumberPowNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        System.out.println(Math.pow(a, b));

    }

}
