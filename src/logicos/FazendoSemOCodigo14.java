package logicos;

public class FazendoSemOCodigo14 {
    public static void main(String[] args) {
        int idade = 19;
        boolean temIngresso = true;

        boolean PodeEntrar = idade >= 18 && temIngresso;
        System.out.println("Está liberado para entrar? " + PodeEntrar);
    }
}
