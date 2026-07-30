import java.util.*;

class vowel_prog
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;
        int i, l;
        str = sc.nextLine();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) != -1)
                System.out.println("ASCII of character: " + ch + " is: " + (int)ch);
        }
    }
}