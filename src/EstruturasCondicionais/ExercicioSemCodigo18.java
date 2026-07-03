package EstruturasCondicionais;

public class ExercicioSemCodigo18 {
    public static void main(String[] args) {
        double faturamento = 150000;
        double tributacao;

        double primeiraFaixa = 8.0 / 100;
        double segundaFaixa = 12.0 / 100;
        double terceiraFaixa = 18.0 / 100;

        if (faturamento <= 50000) {
            tributacao = faturamento * primeiraFaixa;
        } else if (faturamento > 50000 && faturamento < 100000) {
            tributacao = faturamento * segundaFaixa;
        } else {
            tributacao = faturamento * terceiraFaixa;
        }
        System.out.println("O valor da tributação é de: "+tributacao);
    }
}
