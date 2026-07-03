package EstruturasDeRepeticaoBreak;

public class Exercicio07 {
    public static void main(String[] args) {
        // Dado o valor de uma geladeira de R$ 4.500, descubra em quantas parcelas ela pode ser dividida.
        // A condição é que cada parcela seja de no mínimo R$ 300.
        double valorGeladeira = 4500;
        for (int parcela = 1; parcela <= valorGeladeira; parcela++) {
            double parcelaGeladeira = valorGeladeira / parcela;
            if (parcelaGeladeira < 300) {
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + parcelaGeladeira);
        }
    }
}