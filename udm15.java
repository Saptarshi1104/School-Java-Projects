import java.util.*;

class udm15
{
    void compare(int i1, int i2)
    {
        System.out.println("Greater integer is: " + Math.max(i1,i2));
    }
    void compare(char c1, char c2)
    {
        System.out.println("Character with higher numeric value is: " + (char) (Math.max((int) c1, (int) c2)));
    }
    void compare(String s1, String s2)
    {
        if(s1.length() > s2.length())
            System.out.println("String with greater length is: " + s1);
        else if(s2.length() > s1.length())
            System.out.println("String with greater length is: " + s2);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        udm15 ob = new udm15();
        
        System.out.println("Enter two integers to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();
        ob.compare(a,b);
        
        System.out.println("Enter two characters to compare");
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        ob.compare(c,d);
        
        sc.nextLine();
        System.out.println("Enter first string");
        String e = sc.nextLine();
        System.out.println("Enter second string");
        String f = sc.nextLine();
        ob.compare(e,f);
    }
}