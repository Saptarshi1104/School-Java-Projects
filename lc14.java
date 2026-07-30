import java.util.*;

class lc14
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        int d = sc.nextInt();
        double a = 1.0, b = 3.0, c;
        switch(d)
        {
            case 1: for(a = 1.0; a <= 20.0; a+=2.0)
                    {
                        c = (a*a) + (2*a*b);     
                        System.out.println(c);
                    }
                    break;
            case 2: for(int i=1; i<=5; i++)
                    {
                        for(int j=1; j<=i; j++)
                        {
                            System.out.print((char) (j+64));
                        }
                        System.out.println();
                    }
                    break;
            default: System.out.println("Enter valid choice");
        }
    }
}