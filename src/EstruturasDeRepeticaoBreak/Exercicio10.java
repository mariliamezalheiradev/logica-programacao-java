package EstruturasDeRepeticaoBreak;

public class Exercicio10 {
    public static void main(String[] args) {
        // Dado o valor de um guarda-roupa de R$ 7.500, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 750.
        double valorGuardaRoupas = 7500;
        for (int parcela = 1; parcela <= valorGuardaRoupas; parcela++) {
            double valorParcela = valorGuardaRoupas / parcela;
            if (valorParcela < 750) {
                break;
            }
            System.out.println("Valor da parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
