package Bloco03IfElse;

public class Bloco03IfElse18 {
    public static void main(String[] args) {
        // Crie um programa que receba um ano
        // e verifique se ele é BISSEXTO. (Dica: divisível por 4, mas não por 100, ou divisível por 400).
        int ano = 2018;
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}
