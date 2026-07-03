package logicos;

public class FazendoSemOCodigo25 {
    public static void main(String[] args) {
        int maiorDeIdade = 18;
        boolean temCadastro = true;

        boolean podeParticipar = (maiorDeIdade >= 18 && temCadastro);
        System.out.println("Posso participar da promoção? " + podeParticipar);
    }
}
