package EstruturasCondicionais;

public class ExercicioSemCodigo03 {
    public static void main(String[] args) {
        double faturamento = 90000;
        double valorImposto;

        double primeiraFaixa = 8.0 / 100;
        double segundaFaixa = 12.0 / 100;
        double terceiraFaixa = 18.0 / 100;

        if (faturamento <= 50000) {
            valorImposto = faturamento * primeiraFaixa;
        } else if (faturamento > 50000 && faturamento <= 100000) {
            valorImposto = faturamento * segundaFaixa;
        } else {
            valorImposto = faturamento * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
