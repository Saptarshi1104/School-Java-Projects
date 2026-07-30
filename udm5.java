import java.util.*;

class udm5
{
    public static void area()
    {
        Scanner sc = new Scanner(System.in);
        double area, side, radius, length, breadth;
        int c;
        System.out.println("Enter 1 for circle 2 for square 3 for rectangle");
        c = sc.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter radius");
                    radius = sc.nextDouble();
                    area = 3.14 * radius * radius;
                    System.out.println(area);
                    break;
            case 2: System.out.println("Enter side");
                    side = sc.nextDouble();
                    area = side * side;
                    System.out.println(area);
                    break;
            case 3: System.out.println("Enter length and breadth");
                    length = sc.nextDouble();
                    breadth = sc.nextDouble();
                    area = length * breadth;
                    System.out.println(area);
                    break;
            default: System.out.println("Enter valid choice");
        }
    }
    public static void main()
    {
        area();
    }
}