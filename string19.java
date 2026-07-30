package String;

import java.util.*;

class string19
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr;
        char ch, nch, lch=' ';
        int i,l,k=0,nl,j,c=0; //Update k always !?
        System.out.println("Enter a string");
        str = sc.nextLine() + ' ';
        str = str.toUpperCase();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = str.substring(k,i);
                nl = nstr.length();
                lch = ' ';
                for(j=0; j<nl; j++)
                {
                    nch = nstr.charAt(j);
                    if((int) nch == ((int) lch) + 1)
                    {
                        System.out.println(nstr);
                        c++;
                        break;
                    }
                    lch = nch;
                }
                k=i+1;
            }
        }
        System.out.println(c);
    }
}
