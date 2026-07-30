import java.util.*;

class cons3
{
    String str, i;
    int p;
    char ch;
    cons3(String s)
    {
        str = s;
        i = "";
        p = s.length();
        ch = '\u0000';
    }
    void rearrange()
    {
        for(int a=65; a<=90; a++)
        {
            for(int j=0; j<p; j++)
            {
                ch = str.charAt(j);
                if(a == Character.toUpperCase(ch))
                    i += ch;
            }
        }
    }
    void display()
    {
        System.out.println("Alphabets in ascending order: " + i);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        cons3 ob = new cons3(word);
        ob.rearrange();
        ob.display();
    }
}