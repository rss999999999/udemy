
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * Criar um programa usando classe para representar um trinagulo
 *  
 ****************************************************************************************************/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.aula65_1;         //tenho que referenciar aqui!

public class aula65_0 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		aula65_1 x,y;				//tenho que referenciar aqui!
		x = new aula65_1();			//tenho que referenciar aqui!
		y = new aula65_1();			//tenho que referenciar aqui!

		System.out.println("Informe os valores de X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Informe os valores de Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

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