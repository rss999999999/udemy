/**
 *************************************RESUMO DA AULA**************************************************
 * Math.sqrt(int);
 * Math.pow(int);
 * Math.abs(int);
 *
 ****************************************************************************************************/

import java.util.Scanner;

public class aula27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // para sc.nextDouble()

        // SQRT (RAIZ), 
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        //POW (POTENCIA)
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        //ABS (VALOR ABSOLUTOS)
        A = Math.abs(y);
        B = Math.abs(z);
        C = Math.abs(25.0);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        /*
         * // Equação 2º grau:
         * 
         * double a, b, c, delta;
         * 
         * System.out.println("Digite o valor de a: ");
         * a = sc.nextDouble();
         * 
         * System.out.println("Digite o valor de b: ");
         * b = sc.nextDouble();
         * 
         * System.out.println("Digite o valor de c: ");
         * c = sc.nextDouble();
         * 
         * delta = Math.pow(b, 2.0) - 4 * a * c;
         * double x1 = (-b - Math.sqrt(delta)) / 2 * a;
         * double x2 = (-b + Math.sqrt(delta)) / 2 * a;
         * 
         * System.out.println("O valor de x1 = " + x1);
         * System.out.println("O valor de x2 = " + x2);
         */

    }

}