package EstruturasDeRepeticaoBreak;

public class Exercicio11 {
    public static void main(String[] args) {
        // Dado o valor de um ar-condicionado de R$ 3.200, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 250.
        double valorArCondicionado = 3200;
        for (int parcela = 1; parcela <= valorArCondicionado; parcela++) {
            double valorParcela = valorArCondicionado / parcela;
            if (valorParcela <= 250) {
                break;
            }
            System.out.println("Total de parcelas: " + parcela + " R$ " + valorParcela);
        }
    }
}
