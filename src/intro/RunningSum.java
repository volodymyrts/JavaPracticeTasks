package intro;

import java.util.ArrayList;
import java.util.Scanner;

// You have array. Modify it by adding to it's items summ of all items before  plus current item.
// Example: [1, 2, 3, 4, 5] to [1, 3, 6, 10, 15]
public class RunningSum {
    public static void main(String[] args) {

        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Original list: " + arr);

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            arr.set(i, sum);
        }

        System.out.println("Modified list: " + arr);

    }
}
