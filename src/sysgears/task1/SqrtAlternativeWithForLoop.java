package sysgears.task1;

public class SqrtAlternativeWithForLoop {

    public static void main(String[] args) {

        int inputNumber = 1;
        int sqrtNumber = 0;

        for (int i = 1; i <= inputNumber; i++) {
            if (i * i == inputNumber) {
                sqrtNumber = i;
                break;
            } else if (i * i > inputNumber) {
                sqrtNumber = i - 1;
                break;
            }
        }

        System.out.println("sqrtNumber = " + sqrtNumber);

    }

}
