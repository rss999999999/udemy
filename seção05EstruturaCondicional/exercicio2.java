
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * 
 * 	entrada; saída:
 * 
 * 12; par
 * -27; impar
 * 0; par
 *  
 ****************************************************************************************************/

import java.util.Scanner;

public class exercicio2 {
	/**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int numero;


		System.out.println("Digite um numero");
		numero = sc.nextInt();

		
		if(numero%2==1 || numero%2==-1){
			System.out.println("ímpar");
		}
		else{							
			System.out.println("par");
		}
	

		sc.close();

	}
}
