import java.util.*;

class agn15
{
    public static void main()
    {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        y = sc.nextInt();
        if((y%4 == 0 && y%100 != 0) || (y%400 == 0))
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
}