import java.util.*;

class udm7
{
    public static boolean Magic(String str)
    {
        str = str.toUpperCase(); 
        int len = str.length();
        for(int i = 1; i < len; i++)
        {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if((int) curr == (int) prev + 1) // Check for consecutive letters
            {
                return true; // Found a pair
            }
        }
        return false; // No pair found
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        if(Magic(s) ==  true)
            System.out.println("Magic String");
        else
            System.out.println("Not Magic String");
    }
}
