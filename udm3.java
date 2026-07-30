import java.util.*;

class udm3
{
    public static void fact(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(n%i == 0)
            {
                System.out.println("First factor is: " + i);
                System.out.println("Second factor is: " + n/i);
                break;
            }   
        }
    }
    public static void main()
    {
        Scanner sc  = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        fact(num);
    }
}