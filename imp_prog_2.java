import java.util.*;

class imp_prog_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,s=0;
        for(i=2; i<=20; i+=2)
        {
            if(i%4==0)
            s -= i;
            else if(i%2 == 0)
            s += i;
        }
        System.out.println(s);
    }
}