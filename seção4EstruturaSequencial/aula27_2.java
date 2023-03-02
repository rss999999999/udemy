
/**
 *************************************RESUMO DA AULA**************************************************
 *  #(x+2)*(x+3) tem como raízes -3 e -2
 *  (x+2)*(x+3)=x^2+3x+2x+6 = x^2+ 5x + 6
 *  a=1
 *  b=5
 *  c=6
 * 
 ****************************************************************************************************/

import java.util.Scanner;

public class aula27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // para sc.nextDouble()

        // Equação 2º grau:

        double a, b, c, delta;

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();

        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        double x2 = (-b + Math.sqrt(delta)) / 2 * a;

        System.out.println("O valor de x1 = " + x1);
        System.out.println("O valor de x2 = " + x2);

    }

}