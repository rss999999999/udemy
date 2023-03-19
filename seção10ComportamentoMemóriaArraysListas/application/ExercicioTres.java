package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EntitiesExercicioTres;

public class ExercicioTres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt(); // aqui defino qntas posições meu vetor terá

        EntitiesExercicioTres[] vect = new EntitiesExercicioTres[n]; // vetor de produtos com n elementos

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new EntitiesExercicioTres(name, age, height);
        }

        double avgHeight = EntitiesExercicioTres.avgHeight(vect);
        System.out.printf("\nAltura Média: %.2f%n", avgHeight);

        double percentualMenores = EntitiesExercicioTres.percentUnderSixteen(vect);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentualMenores);

        String[] names = EntitiesExercicioTres.namesUnderSixteen(vect);
        System.out.println("Nomes das pessoas com menos de 16 anos:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }

}
