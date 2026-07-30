import java.util.*;

class cons8
{
    String name;
    int bas, expn;
    double inc, nbas;
    cons8()
    {
        name = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        bas = sc.nextInt();
        expn = sc.nextInt();
    }
    void increment()
    {
        if(expn < 3)
            inc = 1000.0 + (10.0/100.0 * bas);
        else if(expn >= 3 && expn < 5)
            inc = 3000.0 + (12.0/100.0 * bas);
        else if(expn >= 5 && expn < 10)
            inc = 5000.0 + (15.0/100.0 * bas);
        else if(expn >= 10)
            inc = 8000.0 + (20.0/100.0 * bas);
    }
    void display()
    {
        nbas = bas + inc;
        System.out.println("Name: " + name + "\n Experience: " + expn + "\n Increment: " + inc + "\n New Basic: " + nbas);
    }
    public static void main()
    {
        cons8 ob = new cons8();
        ob.accept();
        ob.increment();
        ob.display();
    }
}