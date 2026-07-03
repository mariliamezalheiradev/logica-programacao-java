package comparacao;

public class FazendoSemOCodigo08 {
    public static void main(String[] args) {
        int situacaoDoAluno = 4;
        if (situacaoDoAluno >= 7){
            System.out.println("Aluno aprovado!");
        } else if (situacaoDoAluno >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
