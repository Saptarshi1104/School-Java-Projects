package String;

import java.util.*;

class string10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr="";
        int i, l, k;
        char ch;
        System.out.println("Enter a string");
        str = " " + sc.nextLine();
        l = str.length();
        k = l;
        for(i=l-1; i>=0; i--)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = nstr + " " + str.substring(i+1,k);
                k = i;
            }
        }
        System.out.println(nstr.trim());
    }
}
