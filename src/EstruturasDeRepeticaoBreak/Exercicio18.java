package EstruturasDeRepeticaoBreak;

public class Exercicio18 {
    public static void main(String[] args) {
        // Dado o valor de um curso de inglês de R$ 7.200, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 600.
        double valorCurso = 7200;
        for (int parcela = 1; parcela <= valorCurso; parcela++) {
            double valorParcela = valorCurso / parcela;
            if (valorParcela < 600){
                break;
            }
            System.out.println("Total de parcelas: "+parcela+ " R$ "+valorParcela);
        }
    }
}
