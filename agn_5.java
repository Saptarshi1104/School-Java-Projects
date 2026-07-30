import java.util.*;

class agn_5{
    public static void main(){
        double mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight on Earth");
        earth = sc.nextDouble();
        mercury = earth * 0.38;
        venus = earth * 0.90;
        mars = earth * 0.38;
        jupiter = earth * 2.36;
        saturn = earth * 1.06;
        uranus = earth * 0.89;
        neptune = earth * 1.13;
        System.out.println("Your weight on Mercury is: " + mercury);
        System.out.println("Your weight on Venus is: " + venus);
        System.out.println("Your weight on Earth is: " + earth);
        System.out.println("Your weight on Mars is: " + mars);
        System.out.println("Your weight on Jupiter is: " + jupiter);
        System.out.println("Your weight on Saturn is: " + saturn);
        System.out.println("Your weight on Uranus is: " + uranus);
        System.out.println("Your weight on Neptune is: " + neptune);
    }
}