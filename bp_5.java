import java.util.*;

class bp_5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,m,n,min,max;
        long f = 1;
        System.out.println("Enter two nos, m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        min = Math.min(m,n);
        max = Math.max(m,n);
        if(m>0 && n>0)
        {
            for(i=(min+1); i < max; i++)
            {
                f = 1;
                for(j=1; j<=i; j++)
                f *= j;
                System.out.println("Factorial of " + i + " is: " + f);
            }
        }
        else
        System.out.println("Enter numbers greater than zero");
    }
}