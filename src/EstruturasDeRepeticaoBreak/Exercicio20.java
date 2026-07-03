package EstruturasDeRepeticaoBreak;

public class Exercicio20 {
    public static void main(String[] args) {
        // Dado o valor de um equipamento gamer de R$ 12.000, descubra todas as formas de parcelamento.
        // A condição é que cada parcela seja no mínimo R$ 800.
        double valorEquipamentoGamer = 12000;
        for (int parcela = 1; parcela <= valorEquipamentoGamer; parcela++) {
            double valorParcela = valorEquipamentoGamer / parcela;
            if (valorParcela < 800){
                break;
            }
            System.out.println("Total de parcelas para o equipamento: "+parcela+ " R$ "+valorParcela);
        }
    }
}
