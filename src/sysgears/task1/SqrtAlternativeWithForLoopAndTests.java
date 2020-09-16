package sysgears.task1;

public class SqrtAlternativeWithForLoopAndTests {

    private static void assertThat(int inputNumber, int expectedResult) throws Exception {
        int actualResult = sqrtAlt(inputNumber);
        if (actualResult != expectedResult) {
            throw new Exception(String.format("Wrong result for %s, expected %s but actual was %s", inputNumber, expectedResult, actualResult));
        }
    }

    private static void testSqrtAlt() throws Exception {
        assertThat(1, 1);
        assertThat(2, 1);
        assertThat(3, 1);
        assertThat(4, 2);
        assertThat(5, 2);
        assertThat(24, 4);
        assertThat(25, 5);
        assertThat(26, 5);
    }

    private static int sqrtAlt(final int inputNumber) {
        int sqrtNumber = 1;

        for (int i = 2; i * i <= inputNumber; i++) {
            sqrtNumber = i;
        }

        System.out.println("sqrtNumber = " + sqrtNumber);
        return sqrtNumber;
    }

    public static void main(String[] args) throws Exception {

        testSqrtAlt();
        System.out.println("All tests passed!");

    }

}

//
////If this code works fine, it was written by *HIRURG*
////if not, I don`t know who wrote this
//
//public class AltSqrt {
//    public static void main(String[] args) throws Exception {
//        testAltSqrt();
//
//        System.out.println("All test passed successfully");
//    }
//
//    private static int altSqrt(final int inputNumber) {
//        int factor = 2;
//        int sqFactor = factor * factor;
//
//        for(; sqFactor < inputNumber; factor++, sqFactor = factor*factor);
////        while (sqFactor < inputNumber) {
////            factor++;
////            sqFactor = factor * factor;
////        }
//        if (sqFactor > inputNumber) {
//            factor -= 1;
//        }
//
//        return factor;
//    }
//
//    private static void testAltSqrt() throws Exception {
//        assertThat(1, 1);
//        assertThat(2, 1);
//        assertThat(3, 1);
//        assertThat(4, 2);
//        assertThat(5, 2);
//        assertThat(35, 5);
//        assertThat(36 ,6);
//        assertThat(37, 6);
//    }
//
//    private static void assertThat(int inputNumber, int expectedResult) throws Exception {
//        int actualResult = altSqrt(inputNumber);
//
//        if (actualResult != expectedResult) {
//            throw new Exception(String.format("Wrong result for %s, expected was %s, but actual was %s"
//                    , inputNumber, expectedResult, actualResult));
//        }
//    }
//
//}
//
////        Task: Calculate the square root of a given natural number n rounded down to the nearest integer without using
////        functions sqrt(n) and n^0.5.
////        For example: for number 14 the result will be number 3, for number 28 - number 5.
////
////        Input data: Any natural number n.
////
////        Output data: Square root of a given number, rounded down to the nearest integer number.
