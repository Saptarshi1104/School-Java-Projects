package String;

import java.util.*;

class string13
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, low, nstr = "";
        int i,l, asc;
        char ch, nch;
        System.out.println("Enter a word");
        str = sc.next();
        low = str.toLowerCase();
        l = low.length();
        for(i=0; i<l; i++)
        {
            ch = low.charAt(i);
            if("aeiou".indexOf(ch) != -1)
            {
                asc = (int) ch + 1;
                nch = (char) asc;
                nstr = nstr + nch;
            }
            else
                nstr = nstr + ch;
        }
        System.out.println(nstr);
    }
}
