package EstruturasCondicionais;

public class ExercicioSemCodigo06 {
    public static void main(String[] args) {
        double valorDoCarro = 40000;
        double seguroDoCarro;

        double primeiraFaixa = 2.0 / 100;
        double segundaFaixa = 4.0 / 100;
        double terceiraFaixa = 6.0 / 100;

        if (valorDoCarro < 30000) {
            seguroDoCarro = valorDoCarro * primeiraFaixa;
        } else if (valorDoCarro >= 30000 && valorDoCarro < 60000) {
            seguroDoCarro = valorDoCarro * segundaFaixa;
        } else {
            seguroDoCarro = valorDoCarro * terceiraFaixa;
        }
        System.out.println("Seguro do carro: " + seguroDoCarro);
    }
}
