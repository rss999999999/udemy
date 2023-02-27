import java.util.Locale;
import java.util.Scanner;

public class aula25 {
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);               //imput double com "."". Ex: 4.5, por default está na vírgula. Ex.: 4,5
        Scanner sc = new Scanner(System.in);

/*      String x;
        x = sc.next(); //permite q eu armaze uma palavra e ela seja armazenada dentro do x
        System.out.println("Você digitou: "+x);   //sysout e tab
 */

/*      double y;
        y = sc.nextDouble();
        System.out.printf("Você digitou: %.4f%n", y);
 */

/*      char z;
        z = sc.next().charAt(0);                //irá retornar apenas o primeiro caractere
        System.out.println("Você digitou: " + z);
 */

        //para ler vários dados na mesma linha

        String a;
        int b;
        double c;

        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
        sc.close();
/* 
        cd "c:\temp\ws-java\src\"
        javac exercicio1.java
        java exercicio1 */



    }

}
