import java.util.*;

class StringPROG
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        int l = str.length();
        String nstr, rstr="";
        int nl;
        char ch, c;
        int i, j, k=0, pal_count=0;
        // Update k and rstr
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = str.substring(k,i);
                nl = nstr.length();
                for(j=nl-1; j>=0; j--)
                {
                    c = nstr.charAt(j);
                    rstr = rstr + c;
                }
                if(rstr.equalsIgnoreCase(nstr) == true)
                {
                    pal_count++;
                    System.out.println(nstr);
                }
                k = i+1;
                rstr = "";
            }
        }
        System.out.println(pal_count);
    }
}