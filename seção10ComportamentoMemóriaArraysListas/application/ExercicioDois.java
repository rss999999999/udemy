//vetores = array = arranjo

 package application;
 import java.util.Locale;
 import java.util.Scanner;

 public class ExercicioDois {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();               
        int[] vect = new int[n];     

        for (int i=0; i<vect.length; i++) {       
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

    
        for (int i=0; i<vect.length; i++) {       
            System.out.printf("Valores = %d\n", vect[i]);
            }

        double sum = 0;

        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum/vect.length;
        System.out.printf("Soma = %.2f%n", sum);
        System.out.printf("Media = %.2f%n", avg);

        sc.close();

        }

        
}

