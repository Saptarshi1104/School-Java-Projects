import java.util.*;

class anagram_str
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words");
        String str,s,t="",t1="";
        char c;
        int i,l,j;
        str = sc.next();
        s = sc.next();
        str = str.toUpperCase();
        s = s.toUpperCase();
        if(str.length() == s.length())
        {
            l = str.length();
            for(i=65; i<=90; i++)
            {
                for(j=0; j<l; j++)
                {
                    c = str.charAt(j);
                    if((int)c == i)
                        t = t + c;
                }
            }
            for(i=65; i<=90; i++)
            {
                for(j=0; j<l; j++)
                {
                    c = s.charAt(j);
                    if((int)c == i)
                        t1 = t1 + c;
                }
            }
            if(t.equalsIgnoreCase(t1) == true)
                System.out.println("Anagram String");
            else
                System.out.println("Not Anagram");
        }
        else
            System.out.println("Not Anagram");
    }
}