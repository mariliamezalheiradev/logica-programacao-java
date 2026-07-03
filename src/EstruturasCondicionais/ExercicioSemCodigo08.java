package EstruturasCondicionais;

public class ExercicioSemCodigo08 {
    public static void main(String[] args) {
        double equipamento = 15000;
        double taxaDeManutencao;

        double primeiraFaixa = 4.0 / 100;
        double segundaFaixa = 7.0 / 100;
        double terceiraFaixa = 10.0 / 100;

        if (equipamento < 10000) {
            taxaDeManutencao = equipamento * primeiraFaixa;
        } else if (equipamento >= 10000 && equipamento <= 20000) {
            taxaDeManutencao = equipamento * segundaFaixa;
        } else {
            taxaDeManutencao = equipamento * terceiraFaixa;
        }
        System.out.println("A taxa de manutenção é de: "+taxaDeManutencao);
    }
}
