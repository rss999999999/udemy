
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
 * 	que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
 * 	qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
 * 
 * 	Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
 * 	mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo
 * 
 * 
 * 	Renda								IR
 * 	de R$0,00 a R$2000.00 			> isento
 * 	de R$2000.01 até R$3000.00		>	8%
 * 	de R$3000.01 até R$4500.00		>	18%
 * 	acima de R$4500.00				>	28%
 * 	
 * 	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
 * 	salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
 * 	de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
 * 	duas casas decimais.
 * 
 * 
 * 	entrada; saida:
 * 	3002.00; R$ 80.36
 * 	1701.12; Isento
 * 	4520.00; R$ 355.60
 * 
 * 
 ****************************************************************************************************/

import java.util.Scanner;
import java.util.Locale;

public class exercicio8 {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US); // imput double com "."". Ex: 4.5, por default está na vírgula. Ex.: 4,5

		Scanner sc = new Scanner(System.in);
		float renda;


		System.out.println("Digite a sua renda: ");
		renda = sc.nextFloat();		



		if (renda<=2000) {
			System.out.println("Isento");
		} else if (renda>2000 && renda<=3000) {
			System.out.println("R$" + ((renda-2000)*0.08));
		} else if (renda>3000 && renda<=4500) {
			System.out.println("R$" + (1000*0.08+((renda-3000)*0.18)));
		} else {
			System.out.println("R$" + (1000*0.08+ 1500*0.18+ ((renda-4500)*0.28)));
		}

		sc.close();

	}
}
