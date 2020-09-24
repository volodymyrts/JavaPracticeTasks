package intro.inputoutput;

import java.util.*;

// Write a program that reads two integer numbers from the standard input
// and then outputs them in the reverse order separated by a space.
public class ReverseOutput {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number");
//        Integer num1 = scanner.nextInt();
//        System.out.println("Enter second number");
//        Integer num2 = scanner.nextInt();
//        System.out.println("Output: " + num2 + " " + num1);

// --------------------------------------------------------------

//        Scanner scanner = new Scanner(System.in);
//        List<Integer> numbers = new ArrayList<Integer>();
//        System.out.println("Enter first number");
//        numbers.add(scanner.nextInt());
//        System.out.println("Enter second number");
//        numbers.add(scanner.nextInt());
//
//        System.out.println("Original list: " + numbers);
//        Collections.reverse(numbers);
//        System.out.println("Modified list: " + numbers);

// --------------------------------------------------------------

// Variable length list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements");
        Integer length = scanner.nextInt();
        List<Integer> numbers = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            numbers.add(scanner.nextInt());
        }

        System.out.println("Original list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Modified list: " + numbers);

    }
}
