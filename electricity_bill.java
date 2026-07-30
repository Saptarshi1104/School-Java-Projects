import java.util.*;

class electricity_bill
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double unit, bill = 0, age;
        System.out.println("Enter the number of units consumed");
        unit = sc.nextDouble();
        System.out.println("Enter your age");
        age = sc.nextDouble();
        if(unit <= 100)
            bill = unit * 1.50;
        else if(unit > 100 && unit <= 140)
            bill = (100 * 1.50) + (unit - 100)*2;
        else if(unit > 140 && unit <= 180)
            bill = (100 * 1.50) + (40 * 2) + (unit - 140)*2.50;
        else if(unit > 180)
            bill = (100 * 1.50) + (40 * 2) + (40 * 2.50) + (unit - 180)*3;
        if(age >= 60)
            bill = bill + 150;
        else
            bill = bill + 200;
        System.out.println("Bill is: " + bill);
    }
}