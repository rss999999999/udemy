/*

o construtor eh iniciado qndo eu uso o comando new
Product p = new Product();
Sobrecarga: é possível especificar mais de um construtor na mesma classe;

*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product(); //coonstrutor

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();

        Product product = new Product(name, price); //cria o Construtor sobrecarga

        /* System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity); //cria o Construtor
 */
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}