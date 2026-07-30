import java.util.*;

class p10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine() + " ";
        str = str.toUpperCase();
        int i, l, k=0;
        l = str.length();
        char ch;
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                System.out.println(str.substring(k,i));
                k = i+1;
            }
        }
    }
}