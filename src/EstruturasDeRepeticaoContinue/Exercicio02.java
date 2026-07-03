package EstruturasDeRepeticaoContinue;

public class Exercicio02 {
    public static void main(String[] args) {
        // Dado o valor de um notebook de R$ 5.000, exiba apenas as parcelas cujo valor seja maior ou igual a R$ 250.
        double valorNotebook = 5000;
        for (int parcela = 1; parcela <= valorNotebook; parcela++) {
            double valorParcela = valorNotebook / parcela;
            if (valorParcela < 250){
                continue;
            }
            System.out.println("TOTAL DE PARCELAS: "+parcela+ " R$ "+valorParcela);
        }
    }
}
