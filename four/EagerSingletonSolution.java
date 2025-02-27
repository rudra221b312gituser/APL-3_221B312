class EagerSingletonSolution {
    private static class Holder {
        private static final EagerSingletonSolution INSTANCE = new EagerSingletonSolution();
    }

    private EagerSingletonSolution() {}

    public static EagerSingletonSolution getInstance() {
        return Holder.INSTANCE;
    }
}
