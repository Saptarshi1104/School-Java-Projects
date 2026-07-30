package Constructors;
import java.util.*;

class cons11
{
    String Bname;
    double price;
    cons11()
    {
        Bname = "";
        price = 0.0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        Bname = sc.nextLine();
        price = sc.nextInt();
    }
    void calculate()
    {
        double discount = 0.0;
        if(price <= 1000)
            discount = 2.0/100.0 * price;
        else if(price > 1000 && price <= 3000)
            discount = 10.0/100.0 * price;
        else if(price > 3000)
            discount = 15.0/100.0 * price;
        price -= discount;
    }
    void display()
    {
        System.out.println("Book Name: " + Bname + "\n Price: " + price);
    }
    public static void main()
    {
        cons11 ob = new cons11();
        ob.input();
        ob.calculate();
        ob.display();
    }
}