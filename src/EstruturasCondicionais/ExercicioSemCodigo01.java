package EstruturasCondicionais;

public class ExercicioSemCodigo01 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double valorBonus;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 10.0 / 100;
        double terceiraFaixa = 15.0 / 100;

        if (salarioAnual <= 20000){
            valorBonus = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 20000 && salarioAnual <= 50000) {
            valorBonus = salarioAnual * segundaFaixa;
        } else {
            valorBonus = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorBonus);
    }
}
