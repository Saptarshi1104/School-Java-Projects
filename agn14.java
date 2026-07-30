import java.util.*;

class agn14
{
    public static void main()
    {
        int n, i, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        for(i=1; i<= n; i++)
            s = s + (int) Math.pow(i*2-1,2);
        System.out.println("Sum is: " + s);
    }
}