
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * Criar um programa sem nenhuma orientação a objetos
 *  
 ****************************************************************************************************/

package application;

import java.util.Locale;
import java.util.Scanner;

public class aula63 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Informe os valores de X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Informe os valores de Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA+xB+xC)/2;
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

		p = (yA+yB+yC)/2;
		double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);

		if (areaX>areaY){
			System.out.println("A área de X é maior!!!");
		}
		else{
			System.out.println("A maior área é de Y!!!!!!");		
		}
			

		sc.close();

}
}