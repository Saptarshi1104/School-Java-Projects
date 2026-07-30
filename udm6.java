import java.util.*;

class udm6
{
    public static int Glcm(int a, int b)
    {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int r;
        int gcd;
        while(min != 0)
        {
            r = max%min;
            max=min;
            min=r;
        }
        gcd = max;
        int lcm = a*b/gcd;
        System.out.println(gcd);
        return lcm;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = Glcm(x,y);
        System.out.println("LCM: " + z);
    }
}