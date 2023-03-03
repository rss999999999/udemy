
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
 * 	em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se 
 * 	encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá 
 * 	ser impressa a mensagem “Fora de intervalo”.
 * 
 * 	entrada; saida:
 * 	25.01; Intervalo (25,50]
 * 	25.00; Intervalo [0,25]
 *  100.00Intervalo (75,100]
 * 	-25.02; Fora de intervalo
 * 
 ****************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US); // imput double com "."". Ex: 4.5, por default está na vírgula. Ex.: 4,5

		Scanner sc = new Scanner(System.in);
		float numero;

		System.out.println("Digite um numero: ");
		numero = sc.nextFloat();


		if (numero >25 && numero <=50) {
			System.out.println("Intervalo (25,50]");
		} else if (numero >=0 && numero <=25) {
			System.out.println("Intervalo [0,25]");
		} else if (numero > 75 && numero <=100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();

	}
}
