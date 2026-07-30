import java.util.*; // Importing all packages of java.util library

class agn_1{
    public static void main(){
        int side, area, peri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        side = sc.nextInt();
        area = side * side; // Calculating the area of the square
        peri = 4 * side; // Calculating the perimeter of the square
        System.out.println("The area is: " + area); // Displaying the area of the square
        System.out.println("The perimeter is: " + peri); // Displaying the perimeter of the square
    }
}