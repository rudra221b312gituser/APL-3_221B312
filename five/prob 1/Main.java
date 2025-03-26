public class Main 
{
    public static void main(String[] args)
    {
        Whiskey myWhiskey = new Whiskey();
        myWhiskey.templateMethod();
        Rum myRum = new Rum();
        myRum.templateMethod();
        Beer myBeer = new Beer();
        myBeer.templateMethod();
    }
}
