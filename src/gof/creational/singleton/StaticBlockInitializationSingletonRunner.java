package gof.creational.singleton;

public class StaticBlockInitializationSingletonRunner {

    public static void main(String[] args) {

        StaticBlockInitializationSingleton singleton1 = StaticBlockInitializationSingleton.getInstance();
        StaticBlockInitializationSingleton singleton2 = StaticBlockInitializationSingleton.getInstance();

        System.out.println(singleton1 == singleton2);       // true
        System.out.println(singleton1.equals(singleton2));  // true

    }
}
