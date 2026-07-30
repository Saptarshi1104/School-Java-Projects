import java.util.*;

class lc5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int d = (int) b - (int) a;
        if(d==0)
            System.out.println("Same character");
        if(d<0)
            System.out.println("ASCII of First character more than second");
        if(d>0)
            System.out.println("ASCII of second character more than first");
    }
}