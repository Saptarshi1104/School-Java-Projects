import java.util.*;

class agn_6{
    public static void main(){
        double base, altitude, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        base = sc.nextDouble(); // Accepting the base of the triangle
        System.out.println("Enter the altitude of the triangle");
        altitude = sc.nextDouble(); // Accepting the altitude of the triangle
        area = 0.5 * base * altitude; // Calculating the area of the triangle
        System.out.println("The area of the triangle is: " + area); // Displaying the area of the triangle
    }
}