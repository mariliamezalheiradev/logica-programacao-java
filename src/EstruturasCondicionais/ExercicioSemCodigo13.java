package EstruturasCondicionais;

public class ExercicioSemCodigo13 {
    public static void main(String[] args) {
        double lucro = 80000;
        double participacao;

        double primeiraFaixa = 10.0 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 20.0 / 100;

        if (lucro <= 50000) {
            participacao = lucro * primeiraFaixa;
        } else if (lucro > 50000 && lucro < 100000) {
            participacao = lucro * segundaFaixa;
        } else {
            participacao = lucro * terceiraFaixa;
        }
        System.out.println("Lucro: " + participacao);
    }
}
