package logicos;

public class FazendoSemOCodigo15 {
    public static void main(String[] args) {
        int idade = 25;
        boolean temAutorizacao = true;

        boolean podeViajar = idade >= 18 || temAutorizacao;
        System.out.println("Está liberado para viajar? " + podeViajar);
    }
}
