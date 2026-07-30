import java.util.*;

class armstrong_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n, r, k, s = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        k = n;
        while(k>0)
        {
            r = k % 10;
            s = s + (int) Math.pow(r,3);
            k = k / 10;
        }
        if(s == n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}