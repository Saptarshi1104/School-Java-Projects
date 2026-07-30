package String;

import java.util.*;

class string22
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, c, n, j, k;
        System.out.println("Enter your choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter the number of terms");
                    n = sc.nextInt();
                    for(i=n; i>=1; i--)
                    {
                        for(k=0; k<(5-i); k++)
                            System.out.print(" ");
                        for(j=1; j<=i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
            case 2: System.out.println("Enter the number of terms");
                    n = sc.nextInt();
                    for(i=n; i>=1; i--)
                    {
                        for(j=65; j<(i+65); j++)
                            System.out.print((char) j);
                        System.out.println();
                    }
        }
    }
}
