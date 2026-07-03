package EstruturasDeRepeticaoBreak;

public class Exercicio25 {
    public static void main(String[] args) {
        // Dado o valor de um celular de R$ 5.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja superior a R$ 300.
        double valorCelular = 5000;
        for (int parcela = 1; parcela <= valorCelular; parcela++) {
            double valorParcela = valorCelular / parcela;
            if (valorParcela <= 300){
                break;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
