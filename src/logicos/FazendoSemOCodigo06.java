package logicos;

public class FazendoSemOCodigo06 {
    public static void main(String[] args) {
        double valorDoBoleto = 500;
        if (valorDoBoleto > 250){
            valorDoBoleto *= 1.09;
        } else {
            valorDoBoleto *= 1.04;
        }
        System.out.println("Qual o valor do boleto? " + valorDoBoleto);
    }
}
