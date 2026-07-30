import java.util.*;

class agn_12
{
    public static void main()
    {
        int a, i, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        for(i=1; i<=a; i++)
        {
            if(a%i == 0)
            n++;
        }
        if(n==2)
        System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
    }
}