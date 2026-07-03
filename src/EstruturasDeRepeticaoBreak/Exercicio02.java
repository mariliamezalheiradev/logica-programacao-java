package EstruturasDeRepeticaoBreak;

public class Exercicio02 {
    public static void main(String[] args) {
        // Dado o valor de uma moto de R$ 18.000, descubra em quantas parcelas ela pode ser divida.
        // A condição é que cada parcela seja no minimo 500.
        double valorMoto = 18000;
        for (int parcela = 1; parcela <= valorMoto; parcela++) {
            double parcelaMoto = valorMoto / parcela;
            if (parcelaMoto < 500){
                break;
            }
            System.out.println("Total de parcelas " +parcela+ " R$ "+parcelaMoto);
        }
    }
}
