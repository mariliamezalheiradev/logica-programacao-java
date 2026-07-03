package EstruturasCondicionais;

public class ExercicioSemCodigo23 {
    public static void main(String[] args) {
        double valorCompra = 350;
        double desconto;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 15.0 / 100;

        if (valorCompra <= 100) {
            desconto = valorCompra *  primeiraFaixa;
        } else if (valorCompra > 100 && valorCompra <= 500) {
            desconto = valorCompra *  segundaFaixa;
        } else {
            desconto = valorCompra *  terceiraFaixa;
        }
        System.out.println("Desconto: " + desconto);
    }
}
