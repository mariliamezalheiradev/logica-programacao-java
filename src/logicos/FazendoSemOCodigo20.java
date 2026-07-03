package logicos;

public class FazendoSemOCodigo20 {
    public static void main(String[] args) {
        int nota = 10;
        double frequencia = 75.90;

        boolean alunoPassou = (nota >= 7 && frequencia >= 75);
        System.out.println("Este aluno passou? " + alunoPassou);
    }
}
