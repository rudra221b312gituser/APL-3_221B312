class EagerSingleton {
    // Instance is created at the time of class loading
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor prevents instantiation from other classes
    private EagerSingleton() {}

    // Public method to provide global access
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
