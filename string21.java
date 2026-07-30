package String;

import java.util.*;

class string21
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str="ABCDE";
        int i,j,k,l;
        char c, a = 'A';
        l = str.length();
        for(i=0; i<=l; i++)
            System.out.println(str.substring(i,l));
        System.out.println("-------");
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(a);
                a = (char) ((int) a + 1);
            }
            System.out.println();
        }
        System.out.println("--------");
        for(i=0; i<l; i++)
        {
            for(j=0; j<(l-i); j++)
                System.out.print(str.charAt(j));
            for(k=0; k<i; k++)
                System.out.print(str.charAt(k));
            System.out.println();
        }
    }
}
