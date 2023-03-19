//Diferente do vetor, a lista inicia vazia, e seus elementos são alocados sob demanda
//Vantagens da lista: tamanho variável; facilidade para se realizar inserções e deleções
//Desvantagens da lista: Acesso sequencial aos elementos. 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula97 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Romário");
        list.add("Ramildo");
        list.add("Roger");
        list.add("Pedro");
        list.add(2, "Marco");

        System.out.println();
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Anna: " + list.indexOf("Anna"));
        System.out.println("Index of Rodrigo: " + list.indexOf("Rodrigo"));
        System.out.println();


        System.out.println("--------REMOVENDO ALEX E ANNA--------");
        list.remove("Anna");
        list.remove(1);
        for (String y : list) {
            System.out.println(y);
        }
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();


        System.out.println("------REMOVENDO POR PREDICADO------");
        //remove todos da lista que começam com a letra 'M'
        list.removeIf(y -> y.charAt(0) == 'M');
        for (String y : list) {
            System.out.println(y);
        }
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();


        System.out.println("------FILTRO------");
        List<String> result = list.stream().filter(x -> x.charAt(0)=='R').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();


        System.out.println("------1º ELEMENTO COM A LETRA 'P'------");
        String name = list.stream().filter(x -> x.charAt(0)=='P').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();

    }

}