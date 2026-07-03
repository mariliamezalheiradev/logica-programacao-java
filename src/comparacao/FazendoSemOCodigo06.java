package comparacao;

public class FazendoSemOCodigo06 {
    public static void main(String[] args) {
        int valorDaCompra = 100;
        boolean clienteVip = true;
        boolean desconto = valorDaCompra >= 100 && clienteVip;
        System.out.println("O cliente recebe o desconto? " + desconto);
    }
}
