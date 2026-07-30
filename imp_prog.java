import java.util.*;

class imp_prog
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        double s=0.0;
        for(i=1; i<=19; i++)
        {
            s += i/((double) i+1);
        }
        System.out.println(s);
    }
}