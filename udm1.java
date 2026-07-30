import java.util.*;

class udm1
{
    public static double Discount(int p, int d)
    {
      double f;
      f = p*(1-(d/100.0));
      return f;
    }
    public static double Discount(int p, int d1, int d2)
    {
      double f;
      f = p*(1-(d1/100.0))*(1-(d2/100.0));
      return f;
    }
    public static void main()
    {
        int pp, c, dis1, dis2;
        double sp=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the printed price");
        pp = sc.nextInt();
        System.out.println("Enter 1 for single discount and 2 for successive discount");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter a single discount");
                    dis1 = sc.nextInt();
                    sp = Discount(pp, dis1);
                    break;
            case 2: System.out.println("Enter successive discounts");
                    dis1 = sc.nextInt();
                    dis2 = sc.nextInt();
                    sp = Discount(pp, dis1, dis2);
                    break;
            default: System.out.println("Enter valid input");
        }
        System.out.println("Amount to be paid: " + sp);
    }
}