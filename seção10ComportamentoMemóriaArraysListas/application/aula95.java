//Wrapper Classes: são classes equivalentes aos tipos primitivos
//Boxing e unboxinf é natural na linguagem
//Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
//Pois tipos referÊncia (classes) aceitam valor null e usufruem dos recursos OO

 public class aula95 {

    public static void main(String[] args) {

        //BOXING
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        
        //UNBOXING
        int y = (int) obj; 
        System.out.println(y);

        int u =8 != 9 ? 1:2;

        

    }

}