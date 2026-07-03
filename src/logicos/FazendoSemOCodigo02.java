package logicos;

public class FazendoSemOCodigo02 {
    public static void main(String[] args) {
        double preco = 180.0;
        if (preco > 100) {
            preco *= 0.80;
        } else {
            preco *= 0.90;
        }
        System.out.println("Preço final: R$ " + preco);
    }
}
