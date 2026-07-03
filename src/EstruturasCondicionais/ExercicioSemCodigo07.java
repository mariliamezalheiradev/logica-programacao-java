package EstruturasCondicionais;

public class ExercicioSemCodigo07 {
    public static void main(String[] args) {
        double valorDoProduto = 850;
        double taxaDeImportacao;

        double primeiraFaixa = 10.0 / 100;
        double segundaFaixa = 20.0 / 100;
        double terceiraFaixa = 30.0 / 100;

        if (valorDoProduto <= 500) {
            taxaDeImportacao = valorDoProduto * primeiraFaixa;
        } else if (valorDoProduto > 500 && valorDoProduto < 1000) {
            taxaDeImportacao = valorDoProduto * segundaFaixa;
        } else {
            taxaDeImportacao = valorDoProduto * terceiraFaixa;
        }
        System.out.println("A taxa de importação é: "+taxaDeImportacao);
    }
}
