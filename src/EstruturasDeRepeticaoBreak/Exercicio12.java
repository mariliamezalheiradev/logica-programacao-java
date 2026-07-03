package EstruturasDeRepeticaoBreak;

public class Exercicio12 {
    public static void main(String[] args) {
        // Dado o valor de uma viagem de R$ 15.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 1.000.
        double valorViagem = 15000;
        for (int parcela = 1; parcela <= valorViagem; parcela++) {
            double valorParcela = valorViagem / parcela;
            if (valorParcela <= 1000){
                break;
            }
            System.out.println("Valor da parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
