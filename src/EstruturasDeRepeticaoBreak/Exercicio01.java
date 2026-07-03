package EstruturasDeRepeticaoBreak;

public class Exercicio01 {
    public static void main(String[] args) {
        // Dado o valor de uma moto de R$ 18.000, descubra em quantas parcelas ela pode ser dividida.
        // A condição é que cada parcela seja de no mínimo R$ 500.
        double valorMoto = 18000;
        for (int parcela = 1; parcela <= valorMoto; parcela++) {
            double parcelaMoto = valorMoto / parcela;
            if (parcelaMoto < 500){
                break;
            }
            System.out.println("Parcela: " + parcela+ " R$ " + parcelaMoto);
        }
    }
}
