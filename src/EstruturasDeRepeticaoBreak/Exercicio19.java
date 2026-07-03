package EstruturasDeRepeticaoBreak;

public class Exercicio19 {
    public static void main(String[] args) {
        // Dado o valor de uma pós-graduação de R$ 18.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 1.200.
        double valorPosGraduacao = 18000;
        for (int parcela = 1; parcela <= valorPosGraduacao; parcela++) {
            double valorParcela = valorPosGraduacao / parcela;
            if (valorParcela <= 1200){
                break;
            }
            System.out.println("Total de parcelas: "+parcela+ " R$ "+valorParcela);
        }
    }
}
