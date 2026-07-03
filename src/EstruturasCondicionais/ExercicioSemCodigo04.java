package EstruturasCondicionais;

public class ExercicioSemCodigo04 {
    public static void main(String[] args) {
        double valorDoProduto = 450;
        double desconto;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 15.0 / 100;

        if (valorDoProduto <= 100) {
            desconto = valorDoProduto * primeiraFaixa;
        } else if (valorDoProduto > 100 && valorDoProduto <= 300) {
            desconto = valorDoProduto * segundaFaixa;
        } else {
            desconto = valorDoProduto * terceiraFaixa;
        }
        System.out.println("O valor do desconto é: " + desconto);
    }
}
