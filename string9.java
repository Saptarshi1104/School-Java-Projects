package String;

import java.util.*;

class string9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr, rstr = "";
        char ch, nch;
        int i, l, k=0, nl, j;
        str = sc.nextLine() + " ";
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                rstr = "";
                nstr = str.substring(k,i);
                nl = nstr.length();
                for(j=nl-1; j>=0; j--)
                {
                    nch = nstr.charAt(j);
                    rstr = rstr + nch;
                    if(rstr.equalsIgnoreCase(nstr) == true)
                    System.out.println(nstr);
                }
                k = i+1;
            }
        }
    }
}
