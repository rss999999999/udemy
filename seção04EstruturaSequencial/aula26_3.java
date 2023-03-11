/**
 *************************************RESUMO DA AULA**************************************************
 *  #SCANNER
 *      next()
 *      nextInt()
 *      nextDouble()
 *      next().chartAt(0)
 *  #LOCALE: separador de decimais com vírgula e ponto
 *  #COMO LER ATÉ A QUEBRA DE LINHA
 *      nextLine()
 *      como limpar o buffer de leitura: linha pendente 
 * 
 *
 ****************************************************************************************************/

import java.util.Scanner;

public class aula26_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //o scanner vai ler as strings s1, s2 e s3
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();              //qndo aperto enter ele consome a linha (1)
        System.out.println(
            
        );
        s1 = sc.nextLine();          //sc.next() só vai ler a primeira palavra, e não a linha inteira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);        //qndo aperto enter ele consome a linha (2)
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

/** (1) caso não tenha o nextLine() declarado no código, o output será:
 * 
 *  x
 *  s2
 *  s3
 * 
 *  Note que o s1 n foi impresso!
 *  \n quebra a linha!!!!!
 */

    }
}