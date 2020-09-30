package intro.practice;

// You have been given the values of the two moments in time from the same day both
// in the format: hours, minutes and seconds. It is known that the second moment in
// time happened not earlier than the first one.
//
// Find how many seconds passed between these two moments of time.
//
// Input data format: The program gets the input of the three integers: hours, minutes,
// seconds, defining the first moment of time, and three integers that define the second moment time.
//
// Output data format: Output the number of seconds between these two moments of time.
//
// Sample Input:
// 1
// 2
// 30
// 1
// 3
// 20
//
// Sample Output:
// 50

import java.util.Scanner;

public class SecondsBetweenTwoMomentsOfTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers for hours, minutes and seconds of time1:");
        int hour1 = sc.nextInt() * 3600;
        int minute1 = sc.nextInt() * 60;
        int second1 = sc.nextInt();
        System.out.println("Enter three integers for hours, minutes and seconds of time2:");
        int hour2 = sc.nextInt() * 3600;
        int minute2 = sc.nextInt() * 60;
        int second2 = sc.nextInt();

        System.out.println("Seconds between 2 moments: " + (hour2 + minute2 + second2 - hour1 - minute1 - second1));
    }
}
