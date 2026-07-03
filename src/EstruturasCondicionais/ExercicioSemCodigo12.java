package EstruturasCondicionais;

public class ExercicioSemCodigo12 {
    public static void main(String[] args) {
        double totalDeProducao = 1200;
        double bonus;

        double primeiraFaixa = 3.0 / 100;
        double segundaFaixa = 6.0 / 100;
        double terceiraFaixa = 10.0 / 100;

        if (totalDeProducao < 500) {
            bonus = totalDeProducao * primeiraFaixa;
        } else if (totalDeProducao >= 500 && totalDeProducao <= 1000) {
            bonus = totalDeProducao * segundaFaixa;
        } else {
            bonus = totalDeProducao * terceiraFaixa;
        }
        System.out.println("Bonus: " + bonus);
    }
}
