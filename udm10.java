import java.util.*;

class udm10
{
    public static void Change(String str)
    {
        str = " " + str;
        int i;
        int l = str.length();
        char ch, c;
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                c = str.charAt(i+1);
                if(Character.isUpperCase(c) == true)
                    c = Character.toLowerCase(c);
                else
                    c = Character.toUpperCase(c);
                System.out.println(c);
            }
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Change(s);
    }
}