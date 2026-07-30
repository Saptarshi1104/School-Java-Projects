package String;

import java.util.*;

class string5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, maxstring = "", nstr;
        char ch;
        int i,len,k=0, maxlen=0, nlen;
        str = sc.nextLine() + " ";
        len = str.length();
        for(i=0; i<len; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = str.substring(k,i);
                nlen = nstr.length();
                if(nlen>maxlen)
                {
                maxstring = nstr;
                maxlen = nlen;
                }
                k = i+1;
            }
        }
        System.out.println(maxstring);
    }
}
