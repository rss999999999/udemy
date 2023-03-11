
package util;

public class CurrencyConverter {
  
   public static final double IOF = 1.06; //final: é uma constante, uma vez atribuido ele n pode mudar mais! Nome de constantes deve ser escrito em letras maiúscalas: PI; NET_SALARY; etc...
    
    public static double total(double realDolar, double dolar){
        return IOF*realDolar*dolar;
    }

}