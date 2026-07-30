import java.util.*;

class lc6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int) a;
        int r, s=0;
        while(b>0)
        {
            r = b%10;
            s = (s*10) + r;
            b = b/10;
        }
        System.out.println((char) s);
    }
}