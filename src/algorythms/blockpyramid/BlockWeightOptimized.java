package algorythms.blockpyramid;

// (row, pos) - parameters of function
// row - row of pyramid
// pos - position of block in pyramid

import java.util.HashMap;

public class BlockWeightOptimized {

    private static HashMap<Integer, Double> map = new HashMap<>();

    private static void assertThat(final int row, final int pos, final double expectedResult) throws Exception {
        double actualResult = W(row, pos);
        if (actualResult != expectedResult) {
            throw new Exception(String.format("Wrong result for (%s, %s), expected %s but actual was %s", row, pos, expectedResult, actualResult));
        }
    }

    public static double W(final int row, final int pos) {
        double pressure;
        Integer mapKey = Integer.valueOf("" + row + pos);

        if (map.containsKey(mapKey)) {
            return map.get(mapKey);
        }

        System.out.println("Running W(" + (row) + ", " + pos + ")");
        if (row == 0) {
            pressure = 0.0;
        } else if (pos == 0) {
            pressure = (W(row - 1, pos) + 1) / 2;
        } else if (pos == row) {
            pressure = (W(row - 1, pos - 1) + 1) / 2;
        } else {
            pressure = (W(row - 1, pos) + 1) / 2 + (W(row - 1, pos - 1) + 1) / 2;
        }

        map.put(mapKey, pressure);
        return pressure;
    }

    public static void main(String[] args) throws Exception {

        assertThat(0,0,0);
        assertThat(1,0,0.5);
        assertThat(1,1,0.5);
        assertThat(2,0,0.75);
        assertThat(2,1,1.5);
        assertThat(2,2,0.75);

        assertThat(3,0,0.875);
        assertThat(3,1,2.125);
        assertThat(3,2,2.125);
        assertThat(3,3,0.875);

        double startTime = System.currentTimeMillis();
        assertThat(322,156,306.4874978174729);
        double calculatoinTime = System.currentTimeMillis() - startTime;

        System.out.println("Calculation time of W(322,156) = " + calculatoinTime/1000 + " seconds.");
//        System.out.println(W(322,156));

    }
}
