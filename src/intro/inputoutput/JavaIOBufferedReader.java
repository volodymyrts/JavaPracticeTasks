package intro.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIOBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = bufferedReader.readLine().split("\\s+"); // splits string by whitespaces
        Integer num1 = Integer.parseInt(numbers[0]);
        Integer num2 = Integer.parseInt(numbers[1]);

        System.out.println("Sum = " + (num1 + num2));
    }
}
