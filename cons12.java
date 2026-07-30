package Constructors;
import java.util.*;

class cons12
{
    String car_type;
    double km, bill;
    cons12()
    {
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        car_type = sc.nextLine();
        km = sc.nextInt();
    }
    void calculate()
    {
        if(km <= 5)
        {
            if(car_type.equalsIgnoreCase("AC Car") == true)
                bill = 150.0;
            else if(car_type.equalsIgnoreCase("Non AC Car") == true)
                bill = 120.0;
        }
        else if(km > 5)
        {
            if(car_type.equalsIgnoreCase("AC Car") == true)
                bill = 150.0 + (12.0 * (km-5));
            else if(car_type.equalsIgnoreCase("Non AC Car") == true)
                bill = 120.0 + (10.0 * (km-5));
        }
    }
    void display()
    {
        System.out.println("Car Type: " + car_type);
        System.out.println("Kilometres travelled: " + km);
        System.out.println("Total Bill: " + bill);
    }
    public static void main()
    {
        cons12 ob = new cons12();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}