import java.util.*;

class udm9
{
    public static void Display(String str)
    {
        int i;
        char ch;
        int l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) == -1)
                System.out.println(ch);
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Display(s);
    }
}