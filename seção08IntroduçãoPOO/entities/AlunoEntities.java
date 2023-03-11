package entities;

public class AlunoEntities {
    public String name;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double notaTotal() {
        return notaUm + notaDois + notaTres;
    }

    public String verificasepassou() {
        if (notaTotal() >= 60) {
            return "Passou";
        } else {
            return "Reprovou.";
        }
    }

    public void verificaQuantoFalta() {
        if (notaTotal() < 60) {
            double falta = 60 - notaTotal();
			System.out.println();
            System.out.printf("Faltaram %.2f pontos para passar.", falta);
        } else {
            System.out.println(".");
        }
    }

}