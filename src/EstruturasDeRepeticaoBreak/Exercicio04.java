package EstruturasDeRepeticaoBreak;

public class Exercicio04 {
    public static void main(String[] args) {
        // Dado o valor de um celular de R$ 3.500, descubra em quantas vezes ele pode ser parcelado.
        // A condição é que cada parcela seja de no mínimo R$ 200.
        double valorCelular = 3500;
        for (int parcela = 1; parcela <= valorCelular; parcela++) {
            double parcelaCelular = valorCelular / parcela;
            if (parcelaCelular < 200) {
                break;
            }
            System.out.println("Total de parcelas " + parcela + " R$ " + parcelaCelular);
        }
    }
}