package String;

import java.util.*;

class string6
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
            System.out.println("ASCII Code of " + ch + " = " + (int) ch);
        }
    }
}
