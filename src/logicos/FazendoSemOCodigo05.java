package logicos;

public class FazendoSemOCodigo05 {
    public static void main(String[] args) {
        double valorDaConta = 300;
        if (valorDaConta > 200) {
            valorDaConta *= 1.12;
        } else {
            valorDaConta *= 1.05;
        }
        System.out.println("Qual o valor total da conta por atraso? " + valorDaConta);
    }
}
