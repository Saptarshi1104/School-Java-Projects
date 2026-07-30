import java.util.*;

class udm4
{
    public static int fact(int x)
    {
        int f = 1;
        for(int i=1; i<=x; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int m,n,p,c;
        n = sc.nextInt();
        m = sc.nextInt();
        p = Math.abs(n-m);
        c = fact(n)/(fact(m)*fact(p));
        System.out.println("nCp = " + c);
    }
}