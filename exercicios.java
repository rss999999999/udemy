import java.util.Locale;
import java.util.Scanner;

public class exercicios {
        public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

        /*
        * ex1
        * int a,b, c;
        * 
        * System.out.println("Digite o valor de a: ");
        * a = sc.nextInt();
        * System.out.println("Digite o valor de b: ");
        * b = sc.nextInt();
        * c = a+b;
        * System.out.println("SOMA: "+c);
        */

        /*
        * ex2
        * double pi, raio, area;
        * pi = 3.14159;
        * 
        * System.out.println("Qual o valor do raio? ");
        * raio = sc.nextDouble();
        * area=pi*Math.pow(raio, 2.0);
        * System.out.println("O valor da área é: "+area);
        */

        /*
        * ex3
        * int a,b,c,d, x;
        * 
        * System.out.println("Digite o valor de a: ");
        * a = sc.nextInt();
        * System.out.println("Digite o valor de b: ");
        * b = sc.nextInt();
        * System.out.println("Digite o valor de c: ");
        * c = sc.nextInt();
        * System.out.println("Digite o valor de d: ");
        * d = sc.nextInt();
        * 
        * x=a*b-c*d;
        * 
        * System.out.println("DIFERENÇA: "+x);
        */

        /*
        * ex4
        * double numero,horas,salarioPorHora, salarioTotal;
        * 
        * System.out.println("Digite o numero do funcionario: ");
        * numero = sc.nextDouble();
        * System.out.println("Digite o valor de horas trabalhadas: ");
        * horas = sc.nextDouble();
        * System.out.println("Digite o valor do salário por 1 hora trabalhada: ");
        * salarioPorHora = sc.nextDouble();
        * 
        * salarioTotal=horas*salarioPorHora;
        * 
        * System.out.println("NUMBER: "+numero);
        * System.out.println("SALARY: U$ "+salarioTotal);
        */

        /*
        * ex5
        * double codigoPeca, numeroPeca,valorPeca, valorTotal;
        * double codigoPeca2, numeroPeca2,valorPeca2, valorTotal2;
        * 
        * 
        * System.out.println("Digite o código da primeira peça: ");
        * codigoPeca = sc.nextDouble();
        * System.out.println("Digite o numero de itens da primera peças: ");
        * numeroPeca = sc.nextDouble();
        * System.out.println("Digite o valor unitario da primeira peça: ");
        * valorPeca = sc.nextDouble();
        * 
        * valorTotal=numeroPeca*valorPeca;
        * 
        * System.out.println("Digite o código da segunda peça: ");
        * codigoPeca2 = sc.nextDouble();
        * System.out.println("Digite o numero de itens da segunda peças: ");
        * numeroPeca2 = sc.nextDouble();
        * System.out.println("Digite o valor unitario da segunda peça: ");
        * valorPeca2 = sc.nextDouble();
        * 
        * valorTotal2=numeroPeca2*valorPeca2;
        * 
        * 
        * double aPagar = valorTotal + valorTotal2;
        * String result = String.format("%.2f", aPagar);
        * 
        * 
        * System.out.println("\nVALOR A PAGAR: "+result);
        */

        /*
        * ex6
        * double a,b,c;
        * double triangulo, circulo, trapezio, quadrado, retangulo;
        * 
        * 
        * System.out.println("Digite o valor de a: ");
        * a = sc.nextDouble();
        * System.out.println("Digite o valor de b: ");
        * b = sc.nextDouble();
        * System.out.println("Digite o valor de c: ");
        * c = sc.nextDouble();
        * 
        * triangulo=(a*b)/2;
        * circulo=3.14159*c*c;
        * trapezio=(a+b)/2*c;
        * quadrado=b*b;
        * retangulo=a*b;
        * 
        * System.out.printf("%nTRIANGULO: %.3f%n",triangulo);
        * System.out.printf("CIRCULO: %.3f%n",circulo);
        * System.out.printf("TRAPEZIO: %.3f%n",trapezio);
        * System.out.printf("QUADRADO: %.3f%n",quadrado);
        * System.out.printf("RETANGULO: %.3f%n",retangulo);
        */

                sc.close();

        }

}