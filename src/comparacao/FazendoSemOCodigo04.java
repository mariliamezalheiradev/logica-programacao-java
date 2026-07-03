package comparacao;

public class FazendoSemOCodigo04 {
    public static void main(String[] args) {
        double saldo = 80.00;
        double precoProduto = 59.90;
        boolean produtoDisponivel = true;
        boolean podeComprar = saldo >= precoProduto && produtoDisponivel;
        System.out.println("Consigo comprar o produto? " + podeComprar);
    }
}
