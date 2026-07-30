import java.util.*;

class bp_7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n, eng, math, sci;
        double avg;
        System.out.println("Enter number of students who appeared for the exam");
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            System.out.println("Enter your name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter English marks");
            eng = sc.nextInt();
            System.out.println("Enter Maths marks");
            math = sc.nextInt();
            System.out.println("Enter Science marks");
            sci = sc.nextInt();
            avg = (eng+math+sci)/3.0;
            System.out.println("Average of student " + name + "  is: " + avg);
        }
    }
}