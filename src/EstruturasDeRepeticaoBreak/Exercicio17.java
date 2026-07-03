package EstruturasDeRepeticaoBreak;

public class Exercicio17 {
    public static void main(String[] args) {
        // Dado o valor de uma impressora de R$ 2.800, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 200.
        double valorImpressora = 2800;
        for (int parcela = 1; parcela <= valorImpressora; parcela++) {
            double valorParcela = valorImpressora / parcela;
            if (valorParcela <= 200) {
                break;
            }
            System.out.println("Total de parcelas: "+parcela+ " R$ "+valorParcela);
        }
    }
}
