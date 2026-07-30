import java.util.*;

class prime_checker
{
    public static void main()
    {
        int i,j,x,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        for(i=1; i<=20; i++)
        {
           c = 0;
           x = sc.nextInt();
           for(j=1; j<=x; j++)
           {
               if(x%j == 0)
               c++;
           }
           if(c == 2)
           System.out.println("Prime Number: " + x);
        }
    }
}