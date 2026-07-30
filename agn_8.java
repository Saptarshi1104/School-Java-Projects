import java.util.*;

class agn_8
{
    public static void main()
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt(); // Accepting the number from the user
        if(a%7 == 0 && a>0) // Checking if the number is positive and divisible by 7
            System.out.println("The number is positive as well as divisible by 7"); // Displaying that the number is positive as well as divisible by 7
        else
            System.out.println("Wrong number inputted");
            // Displaying message for wrong input
    }
}