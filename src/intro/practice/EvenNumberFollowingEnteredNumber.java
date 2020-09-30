package intro.practice;

// You have been given a natural number N, not greater than 10000.
// Output the even number following this N.
//
// Sample Input 1:
// 7
// Sample Output 1:
// 8
//
// Sample Input 2:
// 8
// Sample Output 2:
// 10

import java.util.Scanner;

public class EvenNumberFollowingEnteredNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        solution 1
//        if ((n % 2) == 0)
//            n += 2;
//        else
//            n += 1;

//        solution 2
//        int result = (n / 2) * 2 + 2;

//        solution 3
        int result = n + 2 - n%2;

//        solution 4
//        do {
//           n++;
//        } while (n % 2 != 0);

        System.out.println(n);
    }
}
