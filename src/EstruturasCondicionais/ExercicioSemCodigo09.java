package EstruturasCondicionais;

public class ExercicioSemCodigo09 {
    public static void main(String[] args) {
        double rendaAnual = 75000;
        double impostoDeRenda;

        double primeiraFaixa = 10.0 / 100;
        double segundaFaixa = 20.0 / 100;
        double terceiraFaixa = 30.0 / 100;

        if (rendaAnual < 30000) {
            impostoDeRenda = rendaAnual * primeiraFaixa;
        } else if (rendaAnual >= 30000 && rendaAnual <= 60000) {
            impostoDeRenda = rendaAnual * segundaFaixa;
        } else {
            impostoDeRenda = rendaAnual * terceiraFaixa;
        }
        System.out.println("O imposto a ser pago será de: "+impostoDeRenda);
    }
}
