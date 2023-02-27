import java.util.Locale; 
import java.util.Scanner;


public class aula23 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String product1 = "Computer"; 
		String product2 = "Office desk"; 

		int age = 30;	
		int code = 5290;		   
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.printf("\n\nProducts:\n%s, which proce is $ %.2f\n%s, which price is $ %.2f\n\nRecord: %d years old, code %s and gender: %s\n\nMeasure with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);    
	
		Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
		System.out.printf("\nDigite um némero: ")
        System.out.println("Você digitou: "+x);   //sysout e tab
        
        sc.close();}
}
