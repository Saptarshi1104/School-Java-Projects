import java.util.*;

class bp_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,c, x=0;
        System.out.println("Enter 1 to display all prime numbers and 2 to display all non-prime numbers");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Displaying all prime numbers");
                    for(i=1; i<=100; i++)
                    {
                        x = 0;
                        for(j=1; j<=i; j++)
                        {
                            if(i%j == 0)
                            x++;
                        }
                        if(x == 2)
                        System.out.println(i);
                    }
                    break;
            case 2: System.out.println("Displaying all non prime numbers");
                    for(i=1; i<=100; i++)
                    {
                        x = 0;
                        for(j=1; j<=i; j++)
                        {
                            if(i%j == 0)
                            x++;
                        }
                        if(x > 2)
                        System.out.println(i);
                    }
                    break;   
            default: System.out.println("Enter valid input");
        }
    }
}