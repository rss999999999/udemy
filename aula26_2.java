import java.util.Scanner;

public class aula26_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //o scanner vai ler as strings s1, s2 e s3
        String s1, s2, s3;
        s1 = sc.nextLine();   //sc.next() só vai ler a primeira palavra, e não a linha inteira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

        
    }
}