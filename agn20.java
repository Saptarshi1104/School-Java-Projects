import java.util.*;

class agn20
{
    public static void main()
    {
        String str, nstr="", t="AEIOUaeiou";
        int i, l, v=0, w, s=0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
                s++;
            if(t.indexOf(ch) != -1)
                v++;
            nstr = ch + nstr;
        }
        w = s + 1;
        System.out.println("Number of words is: " + w);
        System.out.println("Number of vowels is: " + v);
        System.out.println("String in the reversed order is: " + nstr);
    }
}