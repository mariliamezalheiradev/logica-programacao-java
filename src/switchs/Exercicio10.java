package switchs;

public class Exercicio10 {
    public static void main(String[] args) {
        byte estacao = 4;

        switch (estacao) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verão");
                break;
            case 3:
                System.out.println("Outono");
                break;
            case 4:
                System.out.println("Inverno");
                break;
            default:
                System.out.println("Estação inválida");
                break;
        }
    }
}
