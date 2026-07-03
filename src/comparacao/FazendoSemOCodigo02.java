package comparacao;

public class FazendoSemOCodigo02 {
    public static void main(String[] args) {
        int idade = 20;
        boolean temIngresso = true;
        boolean podeEntrar = idade >= 18 && temIngresso == true;
        System.out.println("Pode entrar no envento? " + podeEntrar);
    }
}
