import java.util.*;

class Factorial
{
    private int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    void fact()
    {
        int f=1;
        for(int i=1; i<=n; i++)
            f *= i;
        System.out.println(f);
    }
    public static void main()
    {
        Factorial ob = new Factorial();
        ob.input();
        ob.fact();
    }
}