package sysgears.task1;

import java.util.Random;

public class SqrtAlternativeMethodRunner {

    public static void main(String[] args) {

        //SqrtAlternativeMethod sqrt = new SqrtAlternativeMethod((new Random()).nextInt(100));
        SqrtAlternativeMethod sqrt = new SqrtAlternativeMethod(82);
        System.out.println("Sqrt from " + sqrt.getNum() + " is: " + sqrt.getSqrt());

    }

}
