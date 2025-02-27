class LazySingleton {
    // No instance created initially
    private static LazySingleton instance;

    // Private constructor prevents instantiation
    private LazySingleton() {}

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) { // Instance created only when required
            instance = new LazySingleton();
        }
        return instance;
    }
}
