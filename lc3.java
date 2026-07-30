import java.util.*;

class lc3
{
    public static void main()
    {
        int vc = 0, cc = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<= 20; i++)
        {
            char ch = sc.next().charAt(0);
            ch = Character.toUpperCase(ch);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vc++;
            else
                cc++;
        }
        System.out.println("Vowels: " + vc + " Consonants: " + cc);
    }
}