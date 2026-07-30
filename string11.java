package String;

import java.util.*;

class string11
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, sstr, maxstr="";
        int i,l,k=0,slen,j,v=0, maxv = 0;
        char ch, sch;
        System.out.println("Enter a string");
        str = sc.nextLine() + " ";
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                sstr = str.substring(k,i);
                slen = sstr.length();
                for(j=0; j<slen; j++)
                {
                    sch = sstr.charAt(j);
                    if("AEIOUaeiou".indexOf(sch) != -1)
                    v++;
                    if(v > maxv)
                    {
                        maxv = v;
                        maxstr = sstr;
                    }
                }
                v=0;
                k=i+1;
            }
        }
        System.out.println(maxstr);
    }
}
