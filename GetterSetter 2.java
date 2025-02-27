public class LE0 {
    private String name;
    private int speed;

    public CAR(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        CAR car1 = new CAR("Gloster", 80);

        System.out.println("Car Name: " + car1.getName()); 
        System.out.println("Car Speed: " + car1.getSpeed() + " km/h");  

        car1.setName("Hector");
        car1.setSpeed(100);

        System.out.println("Updated Car Name: " + car1.getName()); 
        System.out.println("Updated Car Speed: " + car1.getSpeed() + " km/h");  
    }
}
