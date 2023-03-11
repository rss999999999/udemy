//COESÃO: CADA CLASSE DEVE TER OS CÁLCULOS DO SEU PRÓPRIO PARANAUÊ!
//ASSIM, CLASSE DO TRINAGULO DEVE CALCULAR A ÁREA DO TRINÂNGULO

package entities;    //pacote da classe

public class aula65_1 {   //aula65_1 é o NOME DA CLASSE
	public double a;  		//public indica que o atributo ou método pode ser usado em outros arquivos
	public double b;		//PUBLIC INDICA QUE PODE SER USADO EM OUTROS ARQUIVOS
	public double c;
	public double area(){        //area=nome do método; ()=lista de parâmetros do método

		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));   //se o método n tem return, deve se utilizar o void

	}

}