import java.util.*;

class agn_10
{
    public static void main()
    {
        int a,c,i,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for checking Buzz Number and 2 for calculating Factorial");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter the number");
                    a = sc.nextInt();
                    if(a%10 == 7 || a%7 == 0)
                    System.out.println("Buzz Number");
                    else
                    System.out.println("Not Buzz Number");
                    break;
            case 2: System.out.println("Enter the number");
                    a = sc.nextInt();
                    for(i=a; i>=1; i--)
                    f = f * i;
                    System.out.println(a + "!" + " = " + f);
                    break;
            default: System.out.println("Wrong choice");
        }
    }
}