import java.util.*;

class agn16
{
    public static void main()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 angles");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b+c == 180)
        {
            System.out.println("Triangle is possible");
            if(a==90 || b==90 || c==90)
            System.out.println("Right Angled Triangle");
            else if(a<90 && b<90 && c<90)
            System.out.println("Acute Angled Triangle");
            else if(a>90 || b>90 || c>90)
            System.out.println("Obtuse Angled Triangle");
        }
        else
            System.out.println("Triangle is not possible");
    }
}