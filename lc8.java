import java.util.*;

class lc8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int s = 0, p = 1;
        int n = 0;
        for(int i=1; i<= 10; i++)
        {
            n = sc.nextInt();
            s += n;
            p *= n;
        }
        String S = Integer.toString(s);
        String P = Integer.toString(p);
        System.out.println(S+P);
    }
}