import java.util.*;

class lc11
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int c = sc.nextInt();
        switch(c)
        {
            case 1: for(int i=65; i<=90; i++)
                    {
                        System.out.print((char) i);
                        System.out.println(i);
                    }
                    break;
            case 2: for(int i=122; i>=97; i--)
                    {
                        System.out.print((char) i);
                        System.out.println(i);
                    }
                    break;
        }
    }
}