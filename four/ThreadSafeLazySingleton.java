class ThreadSafeLazySingleton {
    private static volatile ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {}

    public static ThreadSafeLazySingleton getInstance() {
        if (instance == null) { // First check
            synchronized (ThreadSafeLazySingleton.class) {
                if (instance == null) { // Second check (inside synchronized block)
                    instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}
