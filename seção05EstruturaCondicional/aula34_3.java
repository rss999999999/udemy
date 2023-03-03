
/**
 *************************************RESUMO DA AULA**************************************************
 *  
 * 	ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS [ IF-(ELSE(IF-ELSE)) ]
 * 	ELSE NÃO TEM CONDIÇÃO
 * 	SE TIVER APENAS UM COMANDO DENTRO DO IF OU ELSE, N PRECISO USAR AS CHAVES {}
 * 
 ****************************************************************************************************/

import java.util.Locale;
import java.util.Scanner;

public class aula34_3 {
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
		
		else {										//nunca devo escrever: else(condição)
			if(hora < 18){							//apenas o if tem condição: (hora < 18)
			System.out.println("Boa tarde");
			}
			else{										//else não tem condição
			System.out.println("Boa noite");
			}
			
		}	
		

		sc.close();

	}
}
