class Beer {
  
    private void pour() {
        System.out.println("Pour one pint in a glass");
    }

    private void serve() {
        System.out.println("Serve");
    }

  
    void templateMethod() {
        pour();
        serve();
    }
}