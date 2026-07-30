import java.util.*;

class agn19
{
    public static void main()
    {
        int i, c, n, s = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either 1 or 2 as your choice");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter no. of terms");
                    n = sc.nextInt();
                    for(i=1; i<=n; i++)
                        s = s + (i * 2);
                    System.out.println("Sum is: " + s);
                    break;
            case 2: System.out.println("Enter no. of terms");
                    n = sc.nextInt();
                    for(i=1; i<=n; i++)
                    {
                        if(i%2 == 0)
                            s = s - (i * 2);
                        else if(i%2 != 0)
                            s = s + (i*2);
                    }
                    System.out.println("Sum is: " + s);
                    break;
            default: System.out.println("Wrong choice");
        }
    }
}