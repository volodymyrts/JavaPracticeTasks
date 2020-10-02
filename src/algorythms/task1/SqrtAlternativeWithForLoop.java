package algorythms.task1;

public class SqrtAlternativeWithForLoop {

    public static void main(String[] args) {

        int inputNumber = 5;
        int sqrtNumber = 1;

        for (int i = 2; i * i <= inputNumber; i++) {
            sqrtNumber = i;
        }

        System.out.println("sqrtNumber = " + sqrtNumber);

    }

}
