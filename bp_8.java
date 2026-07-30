import java.util.*;

class bp_8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n, c=0, k, x=0, y, d=0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        k = n;
        for(i=1; i<=n; i++)
        {
            if(n%i == 0)
            c++;
        }
        if(c == 2)
        System.out.println("Original Number is Prime Number");
        else
        System.out.println("Original Number not Prime");
        while(k>0)
        {
            y = k%10;
            x = (x*10) + y;
            k = k/10;
        }
        System.out.println("Reversed Number is: " + x);
        for(i=1; i<=x; i++)
        {
            if(x%i == 0)
            d++;
        }
        if(d == 2)
        System.out.println("Reversed Number is Prime Number");
        else
        System.out.println("Reversed Number not Prime");
        if(c==2 && d==2)
        System.out.println("Both original and reversed numbers are prime, therefore TWISTED PRIME");
        else
        System.out.println("Not a TWISTED PRIME");
    }
}