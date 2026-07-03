package logicos;

public class FazendoSemOCodigo23 {
    public static void main(String[] args) {
        boolean temDesconto = true;
        double valorCompra = 169.90;

        boolean resultado = (temDesconto || valorCompra > 200);
        System.out.println("Teve desconto? " + resultado);
    }
}
