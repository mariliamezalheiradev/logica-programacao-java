package EstruturasDeRepeticaoBreak;

public class Exercicio14 {
    public static void main(String[] args) {
        // Dado o valor de um smartphone de R$ 6.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 400.
        double valorSmartphone = 6000;
        for (int parcela = 1; parcela <= valorSmartphone; parcela++) {
            double parcelaSmartphone = valorSmartphone / parcela;
            if (parcelaSmartphone < 400){
                break;
            }
            System.out.println("Parcela do smartphone: "+parcela+ " R$ "+parcelaSmartphone);
        }
    }
}
