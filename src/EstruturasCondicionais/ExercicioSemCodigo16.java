package EstruturasCondicionais;

public class ExercicioSemCodigo16 {
    public static void main(String[] args) {
        double valorMensalidade = 1200;
        double taxaDeMatricula;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 8.0 / 100;
        double terceiraFaixa = 10.0 / 100;

        if (valorMensalidade <= 500) {
            taxaDeMatricula = valorMensalidade * primeiraFaixa;
        } else if (valorMensalidade > 500 && valorMensalidade < 1000) {
            taxaDeMatricula = valorMensalidade * segundaFaixa;
        } else {
            taxaDeMatricula = valorMensalidade * terceiraFaixa;
        }
        System.out.println("A taxa para a matrícula é de: "+ taxaDeMatricula);
    }
}
