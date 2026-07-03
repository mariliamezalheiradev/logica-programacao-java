package EstruturasCondicionais;

public class ExercicioSemCodigo21 {
    public static void main(String[] args) {
        double nota = 6.5;

        if (nota < 5) {
            System.out.println("Aluno(a) foi reprovado");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Aluno(a) está de recuperação");
        } else {
            System.out.println("Aluno(a) foi aprovado(a)");
        }
    }
}
