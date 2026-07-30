import java.util.*;

class leapyear_check
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = sc.nextInt();
        if(year%4 == 0)
        {
            if(year%100 != 0)
                System.out.println("Leap Year");
            else if(year%400 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
        else
        {
            if(year%400 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
    }
}