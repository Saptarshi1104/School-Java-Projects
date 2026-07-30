import java.util.*;

class udm2
{
    public static int Armstrong(int n)
    {
        int x, s=0;
        int c = n;
        while(n>0)
        {
            x = n%10;
            s += (int) Math.pow(x,3);
            n = n/10;
        }
        if(s == c)
            return 1;
        else
            return 0;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num, as;
        System.out.println("Enter a number");
        num = sc.nextInt();
        as = Armstrong(num);
        if(as == 1)
            System.out.println("Armstrong No.");
        else if(as == 0)
            System.out.println("Not Armstrong No.");
    }
}