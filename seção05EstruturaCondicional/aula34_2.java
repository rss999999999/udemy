
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	ESTRUTURA CONDICIONAL COMPOSTA (IF-ELSE)
 * 
 ****************************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class aula34_2 {
	/**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Que horas são?");
		hora = sc.nextInt();

		
		if(hora<12){
			System.out.println("Bom dia");
		}
		else{
			System.out.println("Boa tarde");
		}

		sc.close();

	}
}
