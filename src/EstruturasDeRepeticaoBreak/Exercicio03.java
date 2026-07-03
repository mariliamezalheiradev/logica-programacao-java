package EstruturasDeRepeticaoBreak;

public class Exercicio03 {
    public static void main(String[] args) {
        // Dado o valor de um notebook de R$ 5.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja de no mínimo R$ 250
        double valorNotebook = 5000;
        for (int parcela = 1; parcela <= valorNotebook; parcela++){
            double parcelaNotebook = valorNotebook / parcela;
            if (parcelaNotebook < 250){
                break;
            }
            System.out.println("Total de parcelas " +parcela+ " R$ "+parcelaNotebook);
        }
    }
}
