
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * 	sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração 
 * 	mínima de 1 hora e máxima de 24 horas.
 * 
 * 	entrada; saída:
 * 
 * 	16 2; O JOGO DUROU 10 HORA(S)
 * 	0 0; O JOGO DUROU 24 HORA(S)
 * 	2 16; O JOGO DUROU 14 HORA(S)
 *  
 ****************************************************************************************************/

import java.util.Scanner;

public class exercicio4 {
	 /**
	  * @param args
	  * @throws Exception
	  */
	 public static void main(String[] args) throws Exception {
 
		 Scanner sc = new Scanner(System.in);
		 int horaInicial;
		 int horaFinal;
 
		 System.out.println("Digite o horário inicial: ");
		 horaInicial = sc.nextInt();
		 System.out.println("Digite a hora final: ");
		 horaFinal = sc.nextInt();
 
		 int casoum = 24 - horaInicial + horaFinal;
		 int casodois = horaFinal - horaInicial;
 
		 if (horaInicial > horaFinal) {
			 System.out.println("O jogo durou " + casoum + " hora(s). ");
		 } else if (horaInicial < horaFinal) {
			 System.out.println("O jogo durou " + casodois + " hora(s). ");
		 } else {
			 System.out.println("O jogo durou 24 hora(s).");
		 }
 
		 sc.close();
 
	 }
 }


