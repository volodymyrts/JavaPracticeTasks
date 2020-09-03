package sysgears.task1;

public class SqrtAlternativeWithForLoop {

    public static void main(String[] args) {

        int number = 1;
        int sqrtNumber = 0;

        for (int i = 1; i < number; i++) {
            if (i * i == number) {
                sqrtNumber = i;
                break;
            } else if (i * i > number) {
                sqrtNumber = i - 1;
                break;
            }
        }

        System.out.println(sqrtNumber);

    }

}
