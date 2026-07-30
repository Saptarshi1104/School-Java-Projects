package String;

import java.util.*;

class string14
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr = "";
        int i,l, asc;
        char ch, nch;
        str = sc.nextLine();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) == -1)
            {
                asc = (int) ch - 1;
                nch = (char) asc;
                if("AEIOUaeiou".indexOf(nch) != -1)
                {
                    asc = (int) ch + 1;
                    nch = (char) asc;
                }
                nstr = nstr + nch;
            }
            else
                nstr = nstr + ch;
        }
        System.out.println(nstr);
    }
}
