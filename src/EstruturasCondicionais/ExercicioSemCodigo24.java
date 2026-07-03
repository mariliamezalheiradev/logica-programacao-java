package EstruturasCondicionais;

public class ExercicioSemCodigo24 {
    public static void main(String[] args) {
        double tempoEmpresa = 4;
        double bonusTempoDeEmpresa;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 /100;
        double terceiraFaixa = 15.0 / 100;

        if (tempoEmpresa < 2) {
            bonusTempoDeEmpresa = tempoEmpresa * primeiraFaixa;
        } else if (tempoEmpresa >= 2 && tempoEmpresa <= 5) {
            bonusTempoDeEmpresa = tempoEmpresa * segundaFaixa;
        } else {
            bonusTempoDeEmpresa = tempoEmpresa * terceiraFaixa;
        }
        System.out.println("O bonus por tempo de empresa é de: "+bonusTempoDeEmpresa);
    }
}
