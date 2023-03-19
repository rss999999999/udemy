
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	ESTRUTURA CONDICIONAL Enquanto (WHILE)
 * 
 ****************************************************************************************************/

import java.util.Scanner;

public class aula44 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int x=1;
		int i=0;

		while (x != 0) {
			System.out.println("Digite um valor: " );
			x = sc.nextInt();
			i += x;
		}
		System.out.println("A soma é: " + i);
		sc.close();
	}

}
