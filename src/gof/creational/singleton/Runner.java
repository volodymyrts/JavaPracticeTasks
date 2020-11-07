package gof.creational.singleton;

public class Runner {

    public static void main(String[] args) {

        LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();

        System.out.println(instance1 == instance2);       // true
        System.out.println(instance1.equals(instance2));  // true

    }

}
