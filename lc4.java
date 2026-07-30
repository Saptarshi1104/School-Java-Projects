import java.util.*;

class lc4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = ' ';
        if(N>0 && N<27)
            ch = (char)(N+64);
        else
            System.out.println("Invalid");
        System.out.println(ch);
    }
}