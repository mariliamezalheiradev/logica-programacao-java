package logicos;

public class FazendoSemOCodigo03 {
    public static void main(String[] args) {
        double salario = 1500.0;
        if (salario <= 2000) {
            salario *= 0.95;
        } else {
            salario *= 1.08;
        }
        System.out.println("Salario final: R$ " + salario);
    }
}
