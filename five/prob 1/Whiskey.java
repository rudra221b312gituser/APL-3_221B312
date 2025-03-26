class Whiskey {
  
    private void pour() {
        System.out.println("Pour 30 ml of whiskey in a glass");
    }

    private void addCondiments() {
        System.out.println("Add some ice");
    }

    private void stir() {
        System.out.println("Stir for 30 seconds");
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
