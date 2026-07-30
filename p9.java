import java.util.*;

class p9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, nstr;
        char ch;
        int i,k=0,l,c=0;
        System.out.println("Enter a string");
        str = sc.nextLine() + " ";
        str = str.toUpperCase();
        l = str.length();
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = str.substring(k,i);
                if(nstr.charAt(0) == 'A')
                    c++;
                k = i+1;
            }
        }
        System.out.println(c);
    }
}