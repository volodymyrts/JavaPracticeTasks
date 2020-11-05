package gof.creational.singleton;

public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton() {
        // private constructor
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        } catch (Exception E) {
            throw new RuntimeException("Exception occured in creating singleton instance!");
        }
    }

    public static StaticBlockInitializationSingleton getInstance() {
        return instance;
    }

}
