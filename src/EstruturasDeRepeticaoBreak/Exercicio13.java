package EstruturasDeRepeticaoBreak;

public class Exercicio13 {
    public static void main(String[] args) {
        // Dado o valor de um procedimento odontológico de R$ 9.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 500.
        double valorProcedimentoOdonto = 9000;
        for (int parcela = 1; parcela <= valorProcedimentoOdonto; parcela++) {
            double valorParcela = valorProcedimentoOdonto / parcela;
            if (valorParcela <= 500){
                break;
            }
            System.out.println("Total de parcelas: " + parcela + " R$ " + valorParcela);
        }
    }
}
