package EstruturasCondicionais;

public class ExercicioSemCodigo17 {
    public static void main(String[] args) {
        double salario = 1800;
        double valorValeAlimentacao;

        double primeiraFaixa = 20.0 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 10.0 / 100;

        if (salario < 2000) {
            valorValeAlimentacao = salario * primeiraFaixa;
        } else if (salario >= 2000 && salario <= 4000) {
            valorValeAlimentacao = salario * segundaFaixa;
        } else {
            valorValeAlimentacao = salario * terceiraFaixa;
        }
        System.out.println("O valor do benefício é de: "+ valorValeAlimentacao);
    }
}
