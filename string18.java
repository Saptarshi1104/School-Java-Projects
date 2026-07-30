package String;

import java.util.*;

class string18
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr = "";
        int i,l;
        char ch, lch, fch;
        System.out.println("Enter a string");
        str = sc.nextLine();
        l = str.length();
        lch = (str.toUpperCase()).charAt(l-1);
        fch = (str.toUpperCase()).charAt(0);
        for(i=l-1; i>=0; i--)
        {
            ch = str.charAt(i);
            nstr = nstr + ch;
        }
        if(nstr.equalsIgnoreCase(str) == true)
            System.out.println("Palindrome");
        else if(fch == lch)
            System.out.println("Special Word");
        else
            System.out.println("None");
    }
}
