
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 *  Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 * 
 * 	entrada; saída:
 * 
 * -10; negativo
 * 8; não negativo
 * 0; não negativo
 * 
 ****************************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	/**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um numero");
		numero = sc.nextInt();

		
		if(numero>0){
			System.out.println("Não Negativo");
		}
		else{							
			System.out.println("Negativo");
		}
	

		sc.close();

	}
}
