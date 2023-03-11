/*

membros estáticos (membros de classe)
uma classe instanciada não ppode ter referências

enter radius 3
circumference 18.84
vol: 113.04
PI value: 3.14

v1 > Metodos na própria classe do programa
v2 > Classe calculator com membros de instância
v3 > classe Calculator com método estático

metodo estático chama metodo estatico
metodo estatica nao chama metodo public
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import util.aula70Entities;

public class aula70Application {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o raio? ");
        double radius = sc.nextDouble();

        double c = aula70Entities.circumference(radius);

        double v = aula70Entities.volume(radius);

        System.out.printf("Circunferêrncia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", aula70Entities.PI);


        sc.close();
    }

    

}