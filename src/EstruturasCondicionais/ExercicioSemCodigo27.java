package EstruturasCondicionais;

public class ExercicioSemCodigo27 {
    public static void main(String[] args) {
        double nota = 9.5;
        
        if (nota < 4) {
            System.out.println("Aluno(a) está reprovado(a)");
        } else if (nota >= 4 && nota <= 6.9) {
            System.out.println("Aluno(a) está em recuperação");
        } else {
            System.out.println("Aluno(a) aprovado(a)");
        }
    }
}
