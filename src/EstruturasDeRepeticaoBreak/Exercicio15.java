package EstruturasDeRepeticaoBreak;

public class Exercicio15 {
    public static void main(String[] args) {
        // Dado o valor de uma câmera fotográfica de R$ 9.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 600.
        double valorCamera = 9000;
        for (int parcela = 1; parcela <= valorCamera; parcela++) {
            double valorParcela = valorCamera / parcela;
            if (valorParcela <= 600) {
                break;
            }
            System.out.println("Total de parcelas: " + parcela + " R$ " + valorParcela);
        }
    }
}
