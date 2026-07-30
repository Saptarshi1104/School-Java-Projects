package String;

import java.util.*;

class string3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr;
        char ch;
        int i,len,w,l,s=0,x=0;
        str = sc.nextLine();
        len = str.length();
        nstr = str.substring(0,1);
        for(i=0; i<len; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            nstr = nstr + " " + str.substring(i+1,i+2);
        }
        System.out.println(nstr);
    }
}
