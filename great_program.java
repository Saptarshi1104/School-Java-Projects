import java.util.*;

class great_program
{
    public static void main()
    {
        int i,j,n;
        double s=0.0,x=0.0,y=1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n");
        n = sc.nextInt();
        for(i=1; i<=(n-1); i++)
        {
            x = 0.0;
            y = 1.0;
            for(j=0; j<=i; j++)
            {
                x += (j+1);
                y *= (j+1);
            }
            System.out.println(x + " " + y);
            s += x/y;
        }
        System.out.println(s);
        }
    }