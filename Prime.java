import java.util.*;

class Prime
{
    private int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    void checkprime()
    {
        int s = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
                s++;
        }
        if(s==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    public static void main()
    {
        Prime ob = new Prime();
        ob.input();
        ob.checkprime();
    }
}