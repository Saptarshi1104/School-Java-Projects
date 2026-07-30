package String;

import java.util.*;

class string23
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,c,l;
        String str;
        char ch;
        System.out.println("Type 1 for a triangle");
        System.out.println("Tyoe 2 for an inverted triangle");
        System.out.println("Enter your choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter a word");
                    str = sc.next();
                    str = str.toUpperCase(); // Optional only if necessary to convert to upper case
                    l = str.length();
                    for(i=0; i<l; i++)
                    {
                        for(j=0; j<=i; j++)
                            System.out.print(str.charAt(i));
                        System.out.println();
                    }
            case 2: System.out.println("Enter a word");
                    str = sc.next();
                    str = str.toUpperCase(); // Optional only if necessary to convert to upper case
                    l = str.length();
                    for(i=l; i>=1; i--)
                        System.out.println(str.substring(0,i));
        }
    }
}
