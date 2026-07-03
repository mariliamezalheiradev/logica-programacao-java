package EstruturasCondicionais;

public class ExercicioSemCodigo19 {
    public static void main(String[] args) {
        double capitalInvestido = 45000;
        double investimento;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 15.0 / 100;

        if (capitalInvestido < 20000) {
            investimento = capitalInvestido * primeiraFaixa;
        } else if (capitalInvestido >= 20000 && capitalInvestido <= 50000) {
            investimento = capitalInvestido * segundaFaixa;
        } else {
            investimento = capitalInvestido * terceiraFaixa;
        }
        System.out.println("O total de investimento é de: "+investimento);
    }
}
