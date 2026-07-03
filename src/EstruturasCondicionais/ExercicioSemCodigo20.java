package EstruturasCondicionais;

public class ExercicioSemCodigo20 {
    public static void main(String[] args) {
        double rendaAnual = 110000;
        double tributacao;

        double primeiraFaixa = 12.0 / 100;
        double segundaFaixa = 20.0 / 100;
        double terceiraFaixa = 27.0 / 100;

        if (rendaAnual <= 40000){
            tributacao = rendaAnual *  primeiraFaixa;
        } else if (rendaAnual > 40000 && rendaAnual < 80000) {
            tributacao = rendaAnual * segundaFaixa;
        } else {
            tributacao = rendaAnual * terceiraFaixa;
        }
        System.out.println("O valor da tributação fica em: "+tributacao);
    }
}
