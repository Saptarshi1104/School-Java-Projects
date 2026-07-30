import java.util.*;

class agn_11
{
    public static void main()
    {
        int a, x, s = 0, p = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a multidigit number");
        a = sc.nextInt();
        while(a>0)
        {
            x = a%10;
            s += x;
            p *= x;
            a = a/10;
        }
        System.out.println("Sum is: " + s);
        System.out.println("Product is: " + p);
    }
}