package String;

import java.util.*;

class string7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;
        int i, l;
        str = sc.nextLine();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) != -1)
            {
                str = str.replace(ch, '*');
            }
        }
        System.out.println(str);
    }
}
