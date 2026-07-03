package EstruturasDeRepeticaoBreak;

public class Exercicio16 {
    public static void main(String[] args) {
        // Dado o valor de um tablet de R$ 3.500, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 250
        double valorTablet = 3500;
        for (int parcela = 1; parcela <= valorTablet; parcela++) {
            double valorParcela = valorTablet / parcela;
            if (valorParcela < 250){
                break;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
