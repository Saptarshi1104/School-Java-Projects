package String;

import java.util.*;

class string8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr;
        char ch;
        int i, l;
        str = sc.nextLine();
        l = str.length();
        nstr = str.substring(0,1);
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
                nstr = nstr + str.substring(i+1,i+2);
        }
        System.out.println(nstr);
    }
}
