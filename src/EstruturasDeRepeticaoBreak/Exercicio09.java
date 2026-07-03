package EstruturasDeRepeticaoBreak;

public class Exercicio09 {
    public static void main(String[] args) {
        // Dado o valor de um computador de R$ 10.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 800.
        double valorComputador = 10000;
        for (int parcela = 1; parcela <= valorComputador; parcela++) {
            double valorParcela = valorComputador / parcela;
            if (valorParcela <= 800) {
                break;
            }
            System.out.println("Total de parcelas: " + parcela + " R$ " + valorParcela);
        }
    }
}
