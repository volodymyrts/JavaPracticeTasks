package gof.creational.singleton;

public class EagerInitializedSingletonRunner {

    public static void main(String[] args) {

        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.equals(singleton2));

    }

}
