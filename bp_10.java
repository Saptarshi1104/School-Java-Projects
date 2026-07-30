import java.util.*;

class bp_10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,n,k,f;
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n>0)
        {
            k = n%10;
            f = 1;
            for(i=k; i>=1; i--)
            {
                f *= i;
            }
            System.out.println("Factorial of " + k + " is: " + f);
            n = n/10;
        }
    }
}