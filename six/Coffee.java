package six;

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
