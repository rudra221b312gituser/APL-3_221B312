

class Main {
    public static void main(String[] args) {
        Beverages b = new Whiskey();
        b.templateMethod(35);

        b = new Beer();
        b.templateMethod(200);
    }
}
