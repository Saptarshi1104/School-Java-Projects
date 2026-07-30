import java.util.*;

class cons4
{
    String str;
    cons4()
    {
        str = null;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        str = sc.nextLine();
    }
    void encode()
    {
        int l = str.length();
        char ch, ch2;
        String nstr = "";
        for(int i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch) == false)
            {
                ch2 = (char) ((int) ch + 2);
                nstr = nstr + ch2;
            }
            else
                nstr = nstr + " ";
        }
        str = nstr;
    }
    void print()
    {
        str = str + " ";
        int l = str.length();
        char ch;
        int start_idx = 0;
        for(int i=0; i<l; i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch) == true)
            {
                System.out.println(str.substring(start_idx, i));
                start_idx = i + 1;
            }
        }
    }
}