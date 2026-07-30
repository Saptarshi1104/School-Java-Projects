import java.util.*;

class lc1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char new_c = (char)(c+10);
        System.out.println("Tenth character is: " + new_c);
    }
}