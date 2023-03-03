
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
 * 	quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * 	codigo; especificação; preço:
 * 
 * 	1; Cachorro Quente; R$4.00 
 * 	2; X-Salada; R$4.50
 * 	3; X-Bacon; R$5.00
 * 	4; Torradaa Simples; R$2.00
 * 	5; Refrigerante; R$1.50
 * 
 * 	entrada; saida:
 * 	3 2; Total: R$10.00
 * 	2 3; Total: R$13.50
 *   
 ****************************************************************************************************/

 import java.util.Scanner;
 import java.util.Locale;
 
 public class exercicio5 {
	 /**
	  * @param args
	  * @throws Exception
	  */
	 public static void main(String[] args) throws Exception {
 
		 Locale.setDefault(Locale.US); // imput double com "."". Ex: 4.5, por default está na vírgula. Ex.: 4,5
 
		 Scanner sc = new Scanner(System.in);
		 int codigoItem;
		 int quantidadeItem;
 
		 System.out.println("Digite o codigo do item: ");
		 codigoItem = sc.nextInt();
		 System.out.println("Digite a quantidade do item: ");
		 quantidadeItem = sc.nextInt();
 
		 if (codigoItem == 1) {
			 System.out.println("Total: " + quantidadeItem * 4);
		 } else if (codigoItem == 2) {
			 System.out.println("Total: " + quantidadeItem * 4.5);
		 } else if (codigoItem == 3) {
			 System.out.println("Total: " + quantidadeItem * 5);
		 } else if (codigoItem == 4) {
			 System.out.println("Total: " + quantidadeItem * 2);
		 } else {
			 System.out.println("Total: " + quantidadeItem * 1.5);
		 }
 
		 sc.close();
 
	 }
 }
 