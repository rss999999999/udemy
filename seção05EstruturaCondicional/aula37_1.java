
/**
 *************************************RESUMO DA AULA**************************************************
 *
 * Um operadora de telefonia cobra 50 reais por um plano básico que 
 * dá direito a 100 minutos de telefone. Cada minutos que exceder a 
 * franquia de 100 min custa 2 reas. Fazer um programa para ler a 
 * quantidade de minuitos que uma pessoa consumiu, daí mostrar o valor 
 * a ser pago.
 * 
 * 	sysout("Valor da conta = R$ %.2f%n", conta)
 * 
 * 
 * 
 * 	Operadores de atribuição cumulativa
 * 	a+=b; a=a+b;
 * 	a-=b; a=a-b;
 *  a*=b; a=a*b;
 *	a/=b; a=a/b;
 * 
 ****************************************************************************************************/

 import java.util.Scanner;
 import java.util.Locale;
 
 public class aula37_1 {
 
	 public static void main(String[] args) throws Exception {
 
		 Locale.setDefault(Locale.US); // input double with ".". Ex: 4.5, by default it is in comma. Ex.: 4,5
 
		 Scanner sc = new Scanner(System.in);
		 float minutos;
		 float conta;
 
		 System.out.println("Digite os minutos utilizados: ");
		 minutos = sc.nextFloat();        
		 conta = 50 + ((minutos - 100) * 2);
 
		 if (minutos < 100) {
			 System.out.println("Valor a pagar: R$50.00");
		 } else {
			 System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		 }
 
		 sc.close();
 
	 }
 }
 