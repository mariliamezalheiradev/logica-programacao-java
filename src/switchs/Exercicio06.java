package switchs;

public class Exercicio06 {
    public static void main(String[] args) {
        byte nivel = 1;

        switch (nivel) {
            case 1:
                System.out.println("Administrador");
                break;
            case 2:
                System.out.println("Usúario");
                break;
            case 3:
                System.out.println("Visitante");
                break;
            default:
                System.out.println("Nível inválido");
                break;
        }
    }
}
