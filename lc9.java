import java.util.*;

class lc8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int c = sc.nextInt();
        switch(c)
        {
            case 1: for(int i = 90; i >= 65; i--)
                    {
                        System.out.println((char) i);
                    }
                    break;
            case 2: for(int i = 97; i <= 122; i++)
                    {
                        System.out.println((char) i);
                    }
                    break;
        }
    }
}