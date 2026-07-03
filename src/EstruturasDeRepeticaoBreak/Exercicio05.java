package EstruturasDeRepeticaoBreak;

public class Exercicio05 {
    public static void main(String[] args) {
        // Dado o valor de uma televisão de R$ 8.000, descubra todas as quantidades possíveis de parcelas.
        // A condição é que cada parcela seja de no mínimo R$ 400.
        double valorTelevisao = 8000;
        for (int parcela = 1; parcela <= valorTelevisao; parcela++) {
            double valorParcela = valorTelevisao / parcela;
            if (valorParcela < 400) {
                break;
            }
            System.out.println("Total de parcelas " + parcela + " R$" + valorParcela);
        }
    }
}
