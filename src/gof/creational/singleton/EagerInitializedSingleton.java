package gof.creational.singleton;

public class EagerInitializedSingleton {

    // instance initialized when loading the class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        // private constructor
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
