package switchs;

public class Exercicio03 {
    public static void main(String[] args) {
        char nota = 'B';

        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            default:
                System.out.println("Conceito inválido");
                break;
        }
    }
}
