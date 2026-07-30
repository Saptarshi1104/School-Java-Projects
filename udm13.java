import java.util.*;

class udm13
{
    public static double Area(double base, double ht)
    {
        double pg = base * ht;
        return pg;
    }
    public static double Area(double c, double dgn1, double dgn2)
    {
        double rh = c * dgn1 * dgn2;
        return rh;
    }
    public static double Area(double c, double sd1, double sd2, double hgt)
    {
        double tr = c * (sd1 + sd2) * hgt;
        return tr;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter base and height of parallelogram");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Parallelogram: " + Area(b,h));
        
        System.out.println("Enter diagonals of rhombus");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Area of Rhombus: " + Area(0.5, d1, d2));
        
        System.out.println("Enter parallel sides and height of trapezium");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double hg = sc.nextDouble();
        System.out.println("Area of Trapezium: " + Area(0.5, s1, s2, hg));
    }
}