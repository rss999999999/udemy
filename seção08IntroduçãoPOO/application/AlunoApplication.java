package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AlunoEntities;

public class AlunoApplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AlunoEntities escola = new AlunoEntities();


        System.out.print("Name: ");
        escola.name = sc.nextLine();
        System.out.print("Informe a nota 1: ");
        escola.notaUm = sc.nextDouble();
        System.out.print("Informe a nota 2: ");
        escola.notaDois = sc.nextDouble();
        System.out.print("Informe a nota 3: ");
        escola.notaTres = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE: " + escola.notaTotal() );
        System.out.print(escola.verificasepassou());
        escola.verificaQuantoFalta();


        sc.close();
    }
}