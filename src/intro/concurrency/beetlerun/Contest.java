package intro.concurrency.beetlerun;

public class Contest {
    public static void main(String[] args) {
        Runnable run1 = new Beetle("John");
        Runnable run2 = new Beetle("Bob");
        Runnable run3 = new Beetle("Leo");
        Runnable run4 = new Beetle("Rick");
        Runnable run5 = new Beetle("Alex");

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        Thread thread3 = new Thread(run3);
        Thread thread4 = new Thread(run4);
        Thread thread5 = new Thread(run5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
