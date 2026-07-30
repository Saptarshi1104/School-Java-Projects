import java.util.*;

class sqrt_checker
{
    public static void main()
    {
        int i,m,n,min,max,sqrt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers, m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        min = Math.min(m,n);
        max = Math.max(m,n);
        if(m > 0 && n > 0)
        {
            for(i = (min + 1); i < max; i++)
            {
                System.out.println(i);
                sqrt = (int) Math.sqrt(i);
                if(sqrt * sqrt == i)
                {
                    System.out.println("Perfect Square: " + i);
                }
            }
        }
        else
        System.out.println("Enter numbers greater than zero");
    }
}