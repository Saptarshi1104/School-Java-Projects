import java.util.*;

class lc12
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice from 1 to 6");
        int c = sc.nextInt();
        switch(c)
        {
            case 1: for(int i=69; i>=65; i--)
                    {
                        for(int j=65; j<=i; j++)
                            System.out.print((char) j);
                        System.out.println();
                    }
                    break;
            case 2: int d = 65;
                    for(int i=1; i<=5; i++)
                    {
                        for(int j=1; j<=i; j++)
                        {
                            System.out.print((char) d);
                            d++;
                        }
                        System.out.println();
                    }
                    break;
            case 3: for(int i=1; i<=5; i++)
                    {
                        for(int j=i; j<=5; j++)
                            System.out.print((char) (j+64));
                        System.out.println();
                    }
                    break;
            case 4: for(int i=69; i>=65; i--)
                    {
                        for(int j=65; j<=i; j++)
                            System.out.print((char) j + "*");
                        System.out.println();
                    }
                    break;
            case 5: for(int i=1; i<=5; i++)
                    {
                        for(int j=1; j<=5; j++)
                            System.out.print((char) (i+64));
                        System.out.println();
                    }
                    break;
            case 6: int e=0;
                    for(int i=5; i>=1; i--)
                    {
                        for(int j=1; j<=i; j++)
                            System.out.print((char) (j+64));
                        e++;
                        for(int k=0; k<=e-1; k++)
                        {
                            if(k != 0)
                                System.out.print((char) (k+64));
                        }
                        System.out.println();
                    }
                    break;
        }
    }
}