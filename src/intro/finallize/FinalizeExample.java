package intro.finallize;

public class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalize is called!");
    }

    public static void main(String[] args) {

        System.out.println("Program started!");
        FinalizeExample fe1 = new FinalizeExample();
        FinalizeExample fe2 = new FinalizeExample();

        fe1 = null;
        fe2 = null;
        System.gc();
    }

}
