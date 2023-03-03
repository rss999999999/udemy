
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS [ IF-ELSE IF-ELSE ]
 * 
 ****************************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class aula34_4 {
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
		else if(hora < 18){							
			System.out.println("Boa tarde");
		}
		else{										
		System.out.println("Boa noite");
		}
		

		sc.close();

	}
}
