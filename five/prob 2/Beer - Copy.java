class Beer extends Beverages {
    @Override
    protected void addCondiments() {
        System.out.println("Nothing to add");
    }

    @Override
    protected void stir() {
        System.out.println("do not stir");
    }
}