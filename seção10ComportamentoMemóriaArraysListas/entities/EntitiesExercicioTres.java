package entities;

public class EntitiesExercicioTres {

    private String name;
    private int age;
    private double height;
    
    public EntitiesExercicioTres(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public static double avgHeight(EntitiesExercicioTres[] vect) {
        double sumHeight = 0;
        for (int i = 0; i < vect.length; i++) {
            sumHeight += vect[i].getHeight();
        }
        return sumHeight / vect.length;
    }

    public static double percentUnderSixteen(EntitiesExercicioTres[] vect) {
        double sumAgeMenor = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                sumAgeMenor++;
            }
        }

        if (sumAgeMenor > 0) {
            return sumAgeMenor / vect.length * 100;
        } else {
            return 0;
        }
    }

    public static String[] namesUnderSixteen(EntitiesExercicioTres[] vect) {
        int counter = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                counter++;
            }
        }

        String[] names = new String[counter];
        int j = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                names[j] = vect[i].getName();
                j++;
            }
        }

        return names;
    }
}
