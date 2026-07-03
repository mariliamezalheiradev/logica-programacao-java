package switchs;

public class Exercicio04 {
    public static void main(String[] args) {
        byte categoria = 2;

        switch (categoria) {
            case 1:
                System.out.println("Eletrônicos");
                break;
            case 2:
                System.out.println("Informática");
                break;
            case 3:
                System.out.println("Roupas");
                break;
            case 4:
                System.out.println("Alimentos");
                break;
            default:
                System.out.println("Categoria inválida");
                break;
        }
    }
}
