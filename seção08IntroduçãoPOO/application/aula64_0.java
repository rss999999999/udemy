
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * Criar um programa usando classe para representar um trinagulo
 *  
 ****************************************************************************************************/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.aula64_1;   //tem que apertar ctrl+shift+O para importar as entities

public class aula64_0 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		aula64_1 x,y;
		x = new aula64_1();
		y = new aula64_1();

		System.out.println("Informe os valores de X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Informe os valores de Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a+x.b+x.c)/2;
		double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

		p = (y.a+y.b+y.c)/2;
		double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

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