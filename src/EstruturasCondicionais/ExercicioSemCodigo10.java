package EstruturasCondicionais;

public class ExercicioSemCodigo10 {
    public static void main(String[] args) {
        double valorPatrimonio = 600000;
        double taxaDoPatrimonio;

        double primeiraFaixa = 1.0 / 100;
        double segundaFaixa = 2.5 / 100;
        double terceiraFaixa = 4.0 / 100;

        if (valorPatrimonio <= 200000) {
            taxaDoPatrimonio = valorPatrimonio * primeiraFaixa;
        } else if (valorPatrimonio > 200000 && valorPatrimonio < 500000) {
            taxaDoPatrimonio = valorPatrimonio * segundaFaixa;
        } else {
            taxaDoPatrimonio = valorPatrimonio * terceiraFaixa;
        }
        System.out.println("O valor á pagar de taxa é: "+taxaDoPatrimonio);
    }
}
