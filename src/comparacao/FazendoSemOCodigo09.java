package comparacao;

public class FazendoSemOCodigo09 {
    public static void main(String[] args) {
        int tentativas = 0;
        boolean senhaCorreta = false;
        tentativas++;
        tentativas++;
        tentativas++;
        boolean contaBloqueada = tentativas > 2 && senhaCorreta;
        System.out.println("tentativas: " + tentativas);
        System.out.println("Conta Bloqueada: " + contaBloqueada);
    }
}
