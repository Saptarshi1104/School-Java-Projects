package String;

import java.util.*;

class string17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        char lch=' ',nch;
        int i,l,c=0;
        System.out.println("Enter the string");
        str = sc.nextLine();
        str = str.toUpperCase();
        l = str.length();
        for(i=0; i<l; i++)
        {
            nch = str.charAt(i);
            if(nch == lch)
                c++;
            lch = nch;
        }
        System.out.println(c);
    }
}
