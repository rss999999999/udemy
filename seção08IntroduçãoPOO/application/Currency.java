
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Currency {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double realDolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dolar = sc.nextDouble();

        double result = CurrencyConverter.total(realDolar, dolar);
    
        System.out.printf("Amount to be paid in reais: %.2f%n", result);
   


        sc.close();
    }

    

}