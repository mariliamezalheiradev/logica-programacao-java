package EstruturasCondicionais;

public class ExercicioSemCodigo02 {
    public static void main(String[] args) {
        double vendasAnuais = 8000;
        double valorComissao;

        double primeiraFaixa = 3.0 / 100;
        double segundaFaixa = 5.0 / 100;
        double terceiraFaixa = 8.0 / 100;

        if (vendasAnuais < 5000) {
            valorComissao = vendasAnuais * primeiraFaixa;
        } else if (vendasAnuais > 5000 && vendasAnuais <= 10000) {
            valorComissao = vendasAnuais * segundaFaixa;
        } else {
            valorComissao = vendasAnuais * terceiraFaixa;
        }
        System.out.println(valorComissao);
    }
}
