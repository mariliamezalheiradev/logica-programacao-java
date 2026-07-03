package EstruturasDeRepeticaoBreak;

public class Exercicio08 {
    public static void main(String[] args) {
        // Dado o valor de um videogame de R$ 4.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja de no mínimo R$ 250.
        double valorVideoGame = 4000;
        for (int parcela = 1; parcela <= valorVideoGame; parcela++) {
            double valorParcela = valorVideoGame / parcela;
            if (valorParcela < 250) {
                break;
            }
            System.out.println("Total de parcelas " + parcela + " R$ " + valorParcela);
        }
    }
}
