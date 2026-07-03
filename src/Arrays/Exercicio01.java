package Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        // Crie um array com 5 nomes de frutas. Use for-each para imprimir todos os nomes em ordem.

        // Cria um array com 5 nomes
        String[] frutas = {"Banana", "Maça", "Abacaxi", "Melão", "Mamão"};

        // Para cada nome no array
        for (String fruta : frutas) {

            // imprime
            System.out.println(fruta);
        }
    }
}
