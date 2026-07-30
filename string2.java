package String;

import java.util.*;

class string2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr = "";
        char ch;
        int i, len;
        str = sc.nextLine();
        len = str.length();
        for(i=0; i<len; i++)
        {
            ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) == -1)
            nstr = nstr + ch;
        }
        System.out.println(nstr);
    }
}
