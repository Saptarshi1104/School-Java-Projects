import java.util.*;

class udm16
{
    double series(double n)
    {
        int i;
        double s = 0.0;
        for(i=1; i<=n; i++)
        {
            s += 1.0/i;
        }
        return s;
    }
    double series(double a, double n)
    {
        // 1/a2 + 4/a5 + 7/a8
        int i;
        double s = 0.0;
        for(i=1; i<=n; i++)
        {
            double x = (3*i) - 2;
            s += x/Math.pow(a, (x+1));
        }
        return s;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        udm16 ob = new udm16();
        double a,n;
        
        System.out.println("Enter the value of n");
        n = sc.nextDouble();
        double result1 = ob.series(n);
        System.out.println(result1);
        
        System.out.println("Enter the value of a and n");
        a = sc.nextDouble();
        n = sc.nextDouble();
        double result2 = ob.series(a,n); 
        System.out.println(result2);
    }
}