package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EntitiesExercicioQuatro;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? " );
        int n = sc.nextInt(); // aqui defino quantas posições meu vetor terá

        EntitiesExercicioQuatro[] vect = new EntitiesExercicioQuatro[n]; // vetor de números com n elementos

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            Integer numero = sc.nextInt();
            vect[i] = new EntitiesExercicioQuatro(numero);
        }

        // Conta a quantidade de números pares no vetor de números
        int countPar = EntitiesExercicioQuatro.countPar(vect);
        System.out.printf("\nQuantidade de pares: %d\n", countPar);

        // Mostra apenas os números pares contidos no vetor
        // Uma lista não tem muito sentido retornar, então alterei o método para retornar um array de inteiros ("Integer")
        Integer[] numerosPares = EntitiesExercicioQuatro.listaNumerosPares(vect);
        System.out.println("Numeros Pares:");
        for (Integer num : numerosPares) {
            System.out.println(num);
        }

        sc.close();
    }

}