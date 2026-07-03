public class ExercicioComCodigo {
    public static void main(String[] args) {

        double vendasAnuais = 80000;
        double valorComissao;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 15.0 / 100;

        if (vendasAnuais <= 30000) {
            valorComissao = vendasAnuais * primeiraFaixa;
        } else if (vendasAnuais > 30000 && vendasAnuais <= 70000) {
            valorComissao = vendasAnuais * segundaFaixa;
        } else {
            valorComissao = vendasAnuais * terceiraFaixa;
        }

        System.out.println(valorComissao);
    }
}