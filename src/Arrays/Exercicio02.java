package Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        // Declare um array com 8 números inteiros de sua escolha. Use for-each para somar todos e exibir o total.

        // cria um array com 8 numeros inteiros
        int[] numeros = {10, 340, 293, 120, 309, 1021, 3949384, 192182,};
        int soma = 0;

        // Para cada numero no array
        for (int num : numeros) {
             soma = soma + num;
        }
        // imprime
        System.out.println(soma);
    }
}
