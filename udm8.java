import java.util.*;

class udm8
{
    public static boolean Palin(String str)
    {
        int l = str.length();
        int i;
        char ch;
        String rstr = "";
        for(i=l-1; i>=0; i--)
        {
            ch = str.charAt(i);
            rstr += ch;
        }
        if(str.equalsIgnoreCase(rstr) == true)
            return true;
        else
            return false;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(Palin(s) == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}