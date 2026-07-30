import java.util.*;

class agn_9
{
    public static void main()
    {
        int age, income;
        double it;
        String gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your taxable income");
        income = sc.nextInt();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your gender");
        gender = sc.next();
        if(age <= 65)
        {
            if(income <= 160000)
            {
                it = 0.0;
                
            }
            else if(income > 160000 && income <= 500000)
            {
                it = (income-160000)*10/100.0;               
            }
            else if(income > 500000 && income <= 800000)
            {
                it = ((income-500000)*20/100.0) + 34000.0;                   
            }
            else if(income > 800000)
            {
                it = ((income-800000)*30/100.0) + 94000.0;
            }
        }
        else if(age > 65)
        System.out.println("Wrong Category");
        System.out.println("Age: " + age + " Income Tax: " + it);
    }
}