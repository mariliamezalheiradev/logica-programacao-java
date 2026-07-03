package EstruturasCondicionais;

public class ExercicioSemCodigo14 {
    public static void main(String[] args) {
        double valorReserva = 2000;
        double taxaHospedagem;

        double primeiraFaixa = 5.0 / 100;
        double segundaFaixa = 8.0 / 100;
        double terceiraFaixa = 12.0 / 100;

        if (valorReserva < 500) {
            taxaHospedagem = valorReserva * primeiraFaixa;
        } else if (valorReserva >= 500 && valorReserva <= 1500) {
            taxaHospedagem = valorReserva * segundaFaixa;
        } else {
            taxaHospedagem = valorReserva * terceiraFaixa;
        }
        System.out.println("A taxa de hospedagem é de: "+ taxaHospedagem);
    }
}
