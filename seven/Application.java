public class Application {
    public static void main(String[] args) {  // Corrected 'Args' to lowercase 'args'
        Crow crow = new IndianCrow();
        Swan swan = new IndianSwan();
        CrowAdapter crowAdapter = new CrowAdapter(crow);

        client(crowAdapter);  // Corrected method call syntax
    }

    public static void client(Swan swan) {
        swan.eat();
        swan.swim();
        swan.sing();
    }
}