/*

ENCAPSULAMENTO (AULA 78)

Aqui estamos na classe application

*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product1;

public class Program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        Product1 product = new Product1(name, price);

/*         product.setName("Computer"); //com o SET eu consigo alterar o valor do atributo
        System.out.println("Updated name: " + product.getName()); //com o GET eu consigo pegar o valor do atributo
        product.setPrice(1200);
        System.out.println("Updated price: " + product.getPrice());
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