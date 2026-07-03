package switchs;

public class Exercicio09 {
    public static void main(String[] args) {
        byte conta = 1;

        switch (conta) {
            case 1:
                System.out.println("Conta Corrente");
                break;
            case 2:
                System.out.println("Conta Poupanca");
                break;
            case 3:
                System.out.println("Conta Salário");
                break;
            default:
                System.out.println("Tipo inválido");
                break;
        }
    }
}
