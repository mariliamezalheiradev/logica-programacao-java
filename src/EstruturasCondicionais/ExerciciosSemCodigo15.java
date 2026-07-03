package EstruturasCondicionais;

public class ExerciciosSemCodigo15 {
    public static void main(String[] args) {
        double valorVenda = 350000;
        double comissao;

        double primeiraFaixa = 2.0 / 100;
        double segundaFaixa = 4.0 / 100;
        double terceiraFaixa = 6.0 / 100;

        if (valorVenda < 100000) {
            comissao = valorVenda * primeiraFaixa;
        } else if (valorVenda >= 100000 && valorVenda <= 300000) {
            comissao = valorVenda * segundaFaixa;
        } else {
            comissao = valorVenda * terceiraFaixa;
        }
        System.out.println("Valor de comissão é: "+comissao);
    }
}