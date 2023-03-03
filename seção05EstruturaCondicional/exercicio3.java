
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * 	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
 * 	ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
 * 	Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * 	entrada; saída:
 * 
 * 6 24; são multiplos
 * 6 25; não são multiplos
 * 24 6; são multiplos
 *  
 ****************************************************************************************************/

import java.util.Scanner;

public class exercicio3 {
	/**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int numeroUm;
		int numeroDois;



		System.out.println("Digite um numero");
		numeroUm = sc.nextInt();
		System.out.println("Digite outro numero");
		numeroDois = sc.nextInt();

		
		if(numeroUm%numeroDois==0 || numeroDois%numeroUm==0){
			System.out.println("São Multiplos");
		}
		else{							
			System.out.println("Não são multiplos");
		}
	

		sc.close();

	}
}
