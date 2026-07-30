package String;

import java.util.*;

class string1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;
        int i,len,w,l,s=0,x=0;
        str = sc.nextLine();
        len = str.length();
        for(i=0; i<len; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            s++;
            x++;
        }
        l = x - s;
        w = s + 1;
        System.out.println(l);
        System.out.println(w);
    }
}
