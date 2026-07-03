package logicos;

public class FazendoSemOCodigo17 {
    public static void main(String[] args) {
        boolean temCartao = true;
        boolean temDinheiro = true;

        boolean daParaPagar = temCartao || temDinheiro;
        System.out.println("Consigo parar em qualquer um dos dois? " + daParaPagar);
    }
}
