package EstruturasDeRepeticaoBreak;

public class Exercicio21 {
    public static void main(String[] args) {
        // Dado o valor de um kit de móveis de R$ 15.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 1.000.
        double valorKitMoveis = 15000;
        for (int parcela = 1; parcela <= valorKitMoveis; parcela++) {
            double valorParcela = valorKitMoveis / parcela;
            if (valorParcela <= 1000){
                break;
            }
            System.out.println("Total de parcelas: "+parcela+ " R$ "+valorParcela);
        }
    }
}
