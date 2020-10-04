package intro.bools;

public class Bools {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        boolean b4 = b1 ^ !b3 & b2; // true
        boolean b5 = b1 ^ !b3 && b2; // false

    }
}
