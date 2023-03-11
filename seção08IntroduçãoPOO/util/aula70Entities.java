//membros estáticos (membros de classe)
//uma classe instanciada não ppode ter referências



/*

enter radius 3
circumference 18.84
vol: 113.04
PI value: 3.14

v1 > Metodos na própria classe do programa
v2 > Classe calculator com membros de instância
v3 > classe Calculator com método estático

*/

package util;

public class aula70Entities {
  
    public static final double PI = 3.14159; //final: é uma constante, uma vez atribuido ele n pode mudar mais! Nome de constantes deve ser escrito em letras maiúscalas: PI; NET_SALARY; etc...
    
    public static double circumference(double radius){
        return 2.0*PI*radius;
    }
    public static double volume(double radius){
        return 4.0*PI*radius*radius*radius/3;
    }

}