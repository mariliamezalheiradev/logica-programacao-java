package logicos;

public class FazendoSemOCodigo24 {
    public static void main(String[] args) {
        boolean produtoDisponivel = true;
        boolean pagamentoAprovado = true;

        boolean conseguiuComprar = (produtoDisponivel && pagamentoAprovado);
        System.out.println("Foi possível comprar? " + conseguiuComprar);
    }
}
