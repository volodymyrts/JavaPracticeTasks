package gof.creational.singleton;

public class Runner {

    public static void main(String[] args) {

        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

        System.out.println(instance1 == instance2);       // true
        System.out.println(instance1.equals(instance2));  // true
        System.out.println();

        StaticBlockInitializationSingleton instance3 = StaticBlockInitializationSingleton.getInstance();
        StaticBlockInitializationSingleton instance4 = StaticBlockInitializationSingleton.getInstance();

        System.out.println(instance3 == instance4);       // true
        System.out.println(instance3.equals(instance4));  // true
        System.out.println();

        LazyInitializationSingleton instance5 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton instance6 = LazyInitializationSingleton.getInstance();

        System.out.println(instance5 == instance6);       // true
        System.out.println(instance5.equals(instance6));  // true
        System.out.println();

    }

}
