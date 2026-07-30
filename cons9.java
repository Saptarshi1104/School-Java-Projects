import java.util.*;

class cons9
{
    String name;
    int mm, scm, comp;
    cons9(String n, int m, int s, int c)
    {
        name = n;
        mm = m;
        scm = s;
        comp = c;
    }
    String check()
    {
        double avg = (mm + scm + comp)/3.0;
        if(mm >= 90 && scm >= 90 && comp >= 90)
            return "Science with Computer";
        else if(avg >= 90)
            return "Bio-Science";
        else if(avg >= 80 && avg < 90)
            return "Science with Hindi";
        else
            return "Not Eligible";
    }
    void display()
    {
        System.out.println("Eligibility: " + check());
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        cons9 ob = new cons9(a,b,c,d);
        ob.display();
    }
}