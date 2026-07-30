import java.util.*;

class bp_4
{
    public static void main()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2 != 0)
                System.out.print("*");
                else if(j%2 == 0)
                System.out.print("#");
            }
            System.out.println();
        }

        for(i=1; i<=5; i++)
        {
            for(j=5; j>=i; j--)
            System.out.print(j);
            System.out.println();
        }
    }
}