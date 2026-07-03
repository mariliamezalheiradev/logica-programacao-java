package EstruturasCondicionais;

public class ExercicioSemCodigo26 {
    public static void main(String[] args) {
        double tempoExperienca = 3;

        if (tempoExperienca < 2) {
            System.out.println("Júnior");
        } else if (tempoExperienca >= 2 && tempoExperienca <= 5) {
            System.out.println("Pleno");
        } else {
            System.out.println("Sênior");
        }
    }
}
