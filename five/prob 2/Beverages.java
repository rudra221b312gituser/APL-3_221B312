abstract class Beverages {
    protected void pour(int quantity) {
        System.out.println("Pour " + quantity + "ml of beverages into a glass");
    }

    protected abstract void addCondiments();
    protected abstract void stir();

    protected void serve() {
        System.out.println("Serve through waiter");
    }

    public void templateMethod(int quantity) {
        pour(quantity);
        addCondiments();
        stir();
        serve();
    }
}


