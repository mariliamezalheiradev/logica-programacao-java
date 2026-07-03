package switchs;

public class Exercicio07 {
    public static void main(String[] args) {
        char turno = 'N';

        switch (turno) {
            case 'M':
                System.out.println("Manhã");
                break;
            case 'T':
                System.out.println("Tarde");
                break;
            case 'N':
                System.out.println("Noite");
                break;
            default:
                System.out.println("Turno inválido");
                break;
        }
    }
}
