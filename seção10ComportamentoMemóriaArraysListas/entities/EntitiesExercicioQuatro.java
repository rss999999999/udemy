package entities;

public class EntitiesExercicioQuatro {

    private int numero;

  
    public EntitiesExercicioQuatro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    // Método estático responsável por contar a quantidade de números pares em um vetor de números
    public static int countPar(EntitiesExercicioQuatro[] vect) {
        int count = 0;
        
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getNumero() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    

    // Método estático responsável por retornar apenas os números pares presentes no vetor
    public static Integer[] listaNumerosPares(EntitiesExercicioQuatro[] vect) {
        int counter = 0;

        // Contador de números pares para saber o tamanho do vetor que guardará os valores pares
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getNumero() % 2 == 0) {
                counter++;
            }
        }

        // Criação do vetor "pares" contendo somente os números pares do vetor original
        Integer[] pares = new Integer[counter];
        int j=0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumero()%2==0) {
                pares[j] = vect[i].getNumero();
                j++;
            }
        }
        return pares; // Retorna o vetor contento apenas os números pares
    }
} 