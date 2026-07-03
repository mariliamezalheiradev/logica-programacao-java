package logicos;

public class FazendoSemOCodigo28 {
    public static void main(String[] args) {
        boolean contaAtiva = true;
        boolean senhaCorreta = true;

        boolean podeAcessar = (contaAtiva && senhaCorreta);
        System.out.println("Consigo acessar minha conta? " + podeAcessar);
    }
}
