import java.util.*;

class agn_7
{
    public static void main()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Numbers before swap, a: " + a + " b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swap, a: " + a + " b: " + b);
    }
}