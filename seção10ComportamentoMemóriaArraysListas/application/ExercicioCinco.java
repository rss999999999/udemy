import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Inserção da quantidade de números a serem lidos e atribuição ao tamanho do vetor
        System.out.print("Digite a quantidade de números que deseja informar: ");
        int n = sc.nextInt();

        // Criação e alocação do vetor
        double[] numeros = new double[n];

        // Leitura dos números pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            numeros[i] = sc.nextDouble();
        }

        // Verificação do maior número e sua posição
        int posicaoMaiorNumero = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[posicaoMaiorNumero]) {
                posicaoMaiorNumero = i;
            }
        }

        // Impressão na tela do resultado
        System.out.println("\nMaior Número: " + numeros[posicaoMaiorNumero] +
                           "\nPosição do Maior Número: " + posicaoMaiorNumero);

        sc.close();
    }
}
