class Whiskey extends Beverages {
    @Override
    protected void addCondiments() {
        System.out.println("Add cold drink");
    }

    @Override
    protected void stir() {
        System.out.println("Stir for 25 seconds");
    }
}