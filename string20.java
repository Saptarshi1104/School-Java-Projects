package String;

import java.util.*;

class string20
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int i,j,l;
        char c;
        str = sc.next();
        l = str.length();
        for(i=l-1; i>=0; i--)
        {
            System.out.println(str.substring(0, (i+1)));
        }
        System.out.println("-------");
        for(i=l-1; i>=0; i--)
        {
            for(j=l-1; j>=i; j--)
                System.out.print(str.charAt(i));
            System.out.println();
        }
        System.out.println("-------");
        for(i=0; i<l; i++)
        {
            System.out.println(str.substring(i, l));
        }
    }
}
