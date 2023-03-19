//Laço "for each"

public class aula96 {

    public static void main(String[] args) {

        String[] vect = new String[] { "Maria", "Bob", "Alex" };

        //FOR COMUM
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------");

        //FOR EACH
        for (String obj : vect){
            System.out.println(obj);
        }

        System.out.println("-----------------------");


    }

}