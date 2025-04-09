package lab6;

public class Coffee extends Offering{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getName() {
        return "Coffee";
    }
}
