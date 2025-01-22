/*
3. Test for Polymorphism
Write another statement in Application class: Mother m1=new Child ( ); Now, call show 
() with reference variable m1 and ‘.’ (dot) operator. Discuss the result with your 
instructor. Now, make the method show ( ) static in Mother only and check the results 
after executing Application. Repeat this by making show () static in Child only. Observe 
the errors. Test whether the static methods are inheritable or not. Now make show () 
static in both Mother as well as in Child and discuss the results with your instructor. 
Make a table to summarize your results.
*/


class Mother 
{
    void show() 
{
        System.out.println("Hello from Mother");
    }
}

class Child extends Mother 
{
    void show() 
{
        System.out.println("Hello from Child");
    }
}

class Application3
 {
    public static void main(String[] args) 
{
        Mother m1 = new Child();
        m1.show();
    }
}
