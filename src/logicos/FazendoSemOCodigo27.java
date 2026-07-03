package logicos;

public class FazendoSemOCodigo27 {
    public static void main(String[] args) {
        boolean temCupom = true;
        boolean compraAcimaDe100 = true;

        boolean temDesconto = (temCupom || compraAcimaDe100);
        System.out.println("Teve desconto? " + temDesconto);
    }
}
