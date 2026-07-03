package switchs;

public class Exercicio08 {
    public static void main(String[] args) {

        byte pedido = 2;

        switch (pedido) {
            case 1:
                System.out.println("Pedido Recebido");
                break;
            case 2:
                System.out.println("Em Preparação");
                break;
            case 3:
                System.out.println("Saiu para Entrega");
                break;
            case 4:
                System.out.println("Entregue");
                break;
            default:
                System.out.println("Status inválido");
                break;
        }
    }
}
