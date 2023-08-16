package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
//    the getInstance method ensures that only one instance
//    of the Singleton class is created and returned.
//    If the instance doesn't exist, it creates one; otherwise, it returns the existing instance.

    // Other methods and fields of the Singleton class
}