//vetores = array = arranjo

 package application;
 import java.util.Locale;
 import java.util.Scanner;
 import entities.Product;

 public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();               //aqui defino qntas posições meu vetor terá
        Product[] vect = new Product[n];     //vetor de produtos com n elementos
        

        for (int i=0; i<vect.length; i++) {       
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

            }
        
        double sum = 0.0;
        
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;

        System.out.printf("Average height: %.2f%n", avg);

        sc.close();
    }

}