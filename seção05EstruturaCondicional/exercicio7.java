
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
 * 	de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
 * 	ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * 	Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * 	Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
 * 	situação.
 * 
 * 								q2	|  q1
 * 								_ _	|__ _
 * 									|
 * 								q3	|  q4
 * 
 * 
 * 
 * 	entrada; saida:
 * 	4.5 -2.2; q4
 * 	0.1 0.1; q1
 * 	0.0 0.0; Origem
 * 
 ****************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class exercicio7 {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US); // imput double com "."". Ex: 4.5, por default está na vírgula. Ex.: 4,5

		Scanner sc = new Scanner(System.in);
		float primeiraCoordenada;
		float segundaCoordenada;


		System.out.println("Digite a primeira coordenada: ");
		primeiraCoordenada = sc.nextFloat();		
		System.out.println("Digite a segunda coordenada: ");
		segundaCoordenada = sc.nextFloat();


		if (primeiraCoordenada >0 && segundaCoordenada > 0) {
			System.out.println("Q1");
		} else if (primeiraCoordenada >0 && segundaCoordenada < 0) {
			System.out.println("Q4");
		} else if (primeiraCoordenada < 0 && segundaCoordenada > 0) {
			System.out.println("Q2");
		} else if (primeiraCoordenada < 0 && segundaCoordenada < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Origem");
		}

		sc.close();

	}
}
