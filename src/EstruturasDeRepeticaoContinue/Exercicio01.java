package EstruturasDeRepeticaoContinue;

public class Exercicio01 {
    public static void main(String[] args) {
        // Dado o valor de uma moto de R$ 18.000, exiba apenas as parcelas cujo valor seja maior ou igual a R$ 500.
        double valorMoto = 18000;
        for (int parcela = 1; parcela <= valorMoto; parcela++) {
            double valorParcela = valorMoto / parcela;
            if (valorParcela < 500){
                continue;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
