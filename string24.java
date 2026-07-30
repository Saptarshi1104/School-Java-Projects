package String;

import java.util.*;

class string24
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c,i,r,j,x=0;
        String str = "ICSE";
        int l = str.length();
        System.out.println("Type 1 for Floyd's Triangle");
        System.out.println("Type 2 to display alphabet pattern");
        System.out.println("Enter choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter the number of rows of the Floyd's Triangle");
                    r = sc.nextInt();
                    for(i=1; i<=r; i++)
                    {
                        for(j=1; j<=i; j++)
                        {
                            x++;
                            System.out.print(x + " ");
                        }
                        System.out.println();
                    }
            case 2: for(i=1; i<=l; i++)
                        System.out.println(str.substring(0,i));
        }
    }
}
