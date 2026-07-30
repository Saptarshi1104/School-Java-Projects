import java.util.*;

class cons7
{
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    cons7()
    {
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = " ";
        pack_type = " ";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code: ");
        product_code = sc.nextInt();
        System.out.println("Enter the flavour: ");
        flavour = sc.next();
        System.out.println("Enter the pack type: ");
        pack_type = sc.next();
        System.out.println("Enter the pack size: ");
        pack_size = sc.nextInt();
        System.out.println("Enter the product price: ");
        product_price = sc.nextInt();
    }
    void discount()
    {
        product_price = product_price - (product_price * 10 / 100);
    }
    void display()
    {
        System.out.println("REVISED PRODUCT DETAILS \n Product Code: " + product_code + "\n Flavour: " + flavour + "\n Pack Type: " + pack_type + "\n Pack Size: " + pack_size + "\n Product Price: " + product_price);
    }
}