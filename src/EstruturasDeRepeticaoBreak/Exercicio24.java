package EstruturasDeRepeticaoBreak;

public class Exercicio24 {
    public static void main(String[] args) {
        // Dado o valor de um notebook de R$ 8.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 500.
        double valorNotebook = 8000;
        for (int parcela = 1; parcela <= valorNotebook; parcela++){
            double valorParcela = valorNotebook / parcela;
            if (valorParcela < 500){
                break;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
