import java.util.*;

class udm14
{
    public static double Perimeter(double side)
    {
        return 4.0 * side;
    }
    public static double Perimeter(double length, double breadth)
    {
        return 2.0 * (length + breadth);
    }
    public static double Perimeter(double c, double pi, double radius)
    {
        return c * pi * radius;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter side of square");
        double s = sc.nextDouble();
        System.out.println("Perimeter of square: " + Perimeter(s));
        
        System.out.println("Enter length and breadth of rectangle");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Perimeter of rectangle: " + Perimeter(l,b));
        
        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();
        System.out.println("Perimeter of circle: " + Perimeter(2.0, 22/7, r));

    }
}