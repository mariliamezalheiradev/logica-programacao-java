package EstruturasCondicionais;

public class ExercicioSemCodigo05 {
    public static void main(String[] args) {
        double salarioBruto = 3500;
        double reajusteSalarial;

        double primeiraFaixa = 15.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 5.0 / 100;

        if (salarioBruto <= 2000) {
            reajusteSalarial = salarioBruto * primeiraFaixa;
        } else if (salarioBruto > 2000 && salarioBruto <= 5000) {
            reajusteSalarial = salarioBruto * segundaFaixa;
        } else {
            reajusteSalarial = salarioBruto * terceiraFaixa;
        }
        System.out.println("O reajuste salárial ficou em: "+reajusteSalarial);
    }
}
