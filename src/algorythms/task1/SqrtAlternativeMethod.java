package algorythms.task1;

public class SqrtAlternativeMethod {

    private int num;
    private int sqrtNum;

    SqrtAlternativeMethod(int n){
        num = n;
        sqrtNum = 0;
    }

    public int getNum() {
        return num;
    }

    public int getSqrt() {

        int i = 1;
        while (i <= num) {
            if (i * i == num) {
                sqrtNum = i;
                break;
            } else if (i * i > num) {
                sqrtNum = i - 1;
                break;
            }
            i++;
        }

        return sqrtNum;
    }

}
