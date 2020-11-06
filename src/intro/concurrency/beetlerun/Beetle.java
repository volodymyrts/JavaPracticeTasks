package intro.concurrency.beetlerun;

import sun.rmi.runtime.NewThreadAction;

import java.util.Random;

// 5 beetles run competition
public class Beetle implements Runnable {

    private final String name;
    private int distance;

    public Beetle(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started!");

        distance = 0;
        do {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            distance += random.nextInt(10) + 1; // 0 - 9
            System.out.println("-" + name + " passed " + distance + " meters");
        } while (distance < 100);

        System.out.println("+" + name + " finished!");
    }
}
