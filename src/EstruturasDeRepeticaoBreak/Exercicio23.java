package EstruturasDeRepeticaoBreak;

public class Exercicio23 {
    public static void main(String[] args) {
        // Dado o valor de uma reforma de cozinha de R$ 25.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 2.000
        double valorReformaCozinha = 25000;
        for (int parcela = 1; parcela <= valorReformaCozinha; parcela++) {
            double valorParcela = valorReformaCozinha / parcela;
            if (valorParcela <= 2000){
                break;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
