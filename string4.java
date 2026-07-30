package String;

import java.util.*;

class string4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int lastSpaceIndex = str.lastIndexOf(' ');
        String nstr = str.substring(lastSpaceIndex+1) + " " + str.substring(0, lastSpaceIndex);
        System.out.println(nstr);
    }
}
