
package requirosoc;

import java.util.Scanner;

public class Products {
    public Product inputProductDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Product Name: ");
        scanner.nextLine();  
        String name = scanner.nextLine();

        System.out.print("Enter Number Sold: ");
        int sold = scanner.nextInt();

        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        
        Product product = new Product();
        product.addProduct(id, name, sold, stock, price);

        return product;
    }
}