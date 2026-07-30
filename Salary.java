import java.util.*;

class Salary
{
    private int basic;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        basic = sc.nextInt();
    }
    void display()
    {
        double da = 0.3 * basic;
        double hra = 0.1 * basic;
        double gross = da + hra + basic;
        System.out.println(da + "\t" + hra + "\t" + gross);
    }
    public static void main()
    {
        Salary ob = new Salary();
        ob.input();
        ob.display();
    }
}