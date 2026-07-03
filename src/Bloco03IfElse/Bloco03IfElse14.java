package Bloco03IfElse;

public class Bloco03IfElse14 {
    public static void main(String[] args) {
        // Crie um programa que receba 3 números e diga qual é o MAIOR deles.
        int numero01 = 30;
        int numero02 = 45;
        int numero03 = 100;
        String nome = "O maior deles é o número: ";

        if (numero01 > numero02 && numero01 > numero03) {
            System.out.println(nome + numero01);
        } else if (numero02 > numero01 && numero02 > numero03) {
            System.out.println(nome + numero02);
        } else {
            System.out.println(nome + numero03);
        }
    }
}
