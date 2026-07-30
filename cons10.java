import java.util.*;

class cons10
{
    int bno, call;
    String name;
    double amt;
    cons10()
    {
        bno = 0;
        call = 0;
        name = "";
        amt = 0.0;
    }
    cons10(int b, String n, int c)
    {
        bno = b;
        name = n;
        call = c;
    }
    void Calculate()
    {
        if(call <= 100)
            amt = call * 0.6;
        else if(call > 100 && call <= 200)
            amt = 60.0 + ((call-100) * 0.8);
        else if(call > 200 && call <= 300)
            amt = 60.0 + 80.0 + ((call-200) * 1.2);
        else if(call > 300)
            amt = 60.0 + 80.0 + 120.0 + ((call-300) * 1.5);
        amt += 125.0;
    }
    void Display()
    {
        System.out.println("Name: " + name + "\n Bill Number: " + bno + "\n No. of calls: " + call + "\n Amount: " + amt);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        int x = sc.nextInt();
        int z = sc.nextInt();
        cons10 ob = new cons10(x,y,z);
        ob.Calculate();
        ob.Display();
    }
}