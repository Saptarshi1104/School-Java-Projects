import java.util.*;

class udm11
{
    public static void Tax(String name, int income)
    {
        double tax = 0.0;
        if(income <= 250000)
            tax = 0.0;
        else if(income >= 250001 && income <= 500000)
            tax = (income - 250000) * 10/100.0;
        else if(income >= 500001 && income <= 1000000)
            tax = 30000.0 + ((income-500000) * 20/100.0);
        else if(income >= 1000001)
            tax = 50000.0 + ((income-1000000) * 30/100.0);
        System.out.println("Name of Employee: " + name + "\n Income Tax: " + tax);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        Tax(s,i);
    }
}