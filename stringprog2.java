import java.util.*;

class stringprog2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        int l = str.length();
        int i,j,k=0,nl,maxv=0,count=0;
        char ch,c;
        String nstr,maxstr="";
        for(i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                nstr = str.substring(k,i);
                nl = nstr.length();
                for(j=0; j<nl; j++)
                {
                    c = nstr.charAt(j);
                    if("AEIOUaeiou".indexOf(c) != -1)
                        count++;
                }
                if(count > maxv)
                {
                    maxstr = nstr;
                    maxv = count;
                }
                k = i+1;
                count = 0;
            }
        }
        System.out.println(maxstr + "\t" + maxv);
    }
}