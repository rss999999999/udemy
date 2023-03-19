//vetores = array = arranjo

 package application;
 import java.util.Locale;
 import java.util.Scanner;

 public class aula88 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();               //aqui defino qntas posições meu vetor terá
        double[] vect = new double [n];
        
        for (int i=0; i<n; i++) {           //aqui dou o valor para cada posiçãodo vetor
            vect[i] = sc.nextDouble();
            }
        
        double sum = 0.0;
        
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum/n;
        System.out.printf("Average height: %.2f%n", avg);

        sc.close();
    }

}