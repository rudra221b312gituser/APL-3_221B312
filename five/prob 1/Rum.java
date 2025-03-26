class Rum {
    
    private void pour() {
        System.out.println("Pour 30 ml of rum in a glass");
    }

    private void addCondiments() {
        System.out.println("Add some cold drink");
    }

    private void stir() {
        System.out.println("Stir for 10 seconds");
    }

    private void serve() {
        System.out.println("Serve");
    }


    void templateMethod() {
        pour();
        addCondiments();
        stir();
        serve();
    }
}
