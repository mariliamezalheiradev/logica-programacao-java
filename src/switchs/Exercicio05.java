package switchs;

public class Exercicio05 {
    public static void main(String[] args) {
        byte operadora = 3;
        switch (operadora) {
            case 1:
                System.out.println("Vivo");
                break;
            case 2:
                System.out.println("Claro");
                break;
            case 3:
                System.out.println("TIM");
                break;
            case 4:
                System.out.println("Oi");
                break;
            default:
                System.out.println("Operadora inválida");
                break;
        }
    }
}
