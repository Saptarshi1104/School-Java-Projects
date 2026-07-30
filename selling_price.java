import java.util.*;

class selling_price
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double mp, d = 0, sp;
        System.out.println("Enter the marked price of the article");
        mp = sc.nextDouble();
        if(mp <= 1000)
            d = 0;
        else if(mp > 1000 && mp <= 5000)
            d = 10;
        else if(mp > 5000 && mp <= 10000)
            d = 15;
        else if(mp > 10000)
            d = 20;
        sp = mp - mp * d/100.0;
        sp = sp + sp * 4.5/100.0;
        System.out.println("Selling Price is: " + sp);
    }
}