package logicos;

public class FazendoSemOCodigo01 {
    public static void main(String[] args) {
        double preco = 200.0;
        if (preco > 150) {
            preco *= 0.90;
        } else {
            preco *= 0.95;
        }
        System.out.println("O preço final ficou: R$" + preco);
    }
}