import java.util.*;

class p11
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2, str = "";
        System.out.println("Enter two strings of equal length");
        s1 = sc.next();
        s2 = sc.next();
        int i,l;
        l = s1.length();
        char c1, c2;
        for(i=0; i<l; i++)
        {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            str = str + c1 + c2;
        }
        System.out.println(str);
    }
}