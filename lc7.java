import java.util.*;

class lc6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int b = 0;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            b = (int) ch;
        System.out.println(b);
    }
}