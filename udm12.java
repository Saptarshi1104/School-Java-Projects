import java.util.*;

class udm12
{
    public static void First(String str)
    {
        str = " " + str;
        int l = str.length();
        int i;
        char ch;
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch ==  ' ')
                System.out.println(str.charAt(i+1));
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        First(s);
    }
}