import java.util.*;

class agn18
{
    public static void main()
    {
        int i,j,c,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either 1 or 2 as your choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter no. of rows");
                    r = sc.nextInt();
                    for(i=1; i<=r; i++)
                    {
                        for(j=1; j<=r; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
            case 2: System.out.println("Enter no. of rows");
                    r = sc.nextInt();
                    for(i=1; i<=r; i++)
                    {
                        for(j=1; j<=i; j++)
                            System.out.print("*");
                        System.out.println(i);
                    }
                    break;
            default: System.out.println("Wrong choice");
        }
    }
}