package EstruturasCondicionais;

public class ExercicioSemCodigo11 {
    public static void main(String[] args) {
        double valorSolicitado = 9000;
        double juros;

        double primeiraFaixa = 2.0 / 100;
        double segundaFaixa = 4.0 / 100;
        double terceiraFaixa = 6.0 / 100;

        if (valorSolicitado < 10000) {
            juros = valorSolicitado * primeiraFaixa;
        } else if (valorSolicitado >= 10000 && valorSolicitado <= 20000) {
            juros = valorSolicitado * segundaFaixa;
        } else {
            juros = valorSolicitado * terceiraFaixa;
        }
        System.out.println("O juros será no valor: "+juros);
    }
}
