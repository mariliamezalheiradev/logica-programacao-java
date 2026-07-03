package EstruturasDeRepeticaoBreak;

public class Exercicio22 {
    public static void main(String[] args) {
        // Dado o valor de um aparelho de academia de R$ 20.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 1.500.
        double valorAparelhoAcademia = 20000;
        for (int parcela = 1; parcela <= valorAparelhoAcademia; parcela++) {
            double valorParcela = valorAparelhoAcademia / parcela;
            if (valorParcela < 1500){
                break;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
