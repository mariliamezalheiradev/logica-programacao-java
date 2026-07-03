package Bloco03IfElse;

public class Bloco03IfElse16 {
    public static void main(String[] args) {
        // Crie um programa que receba dois números
        // e imprima qual é o MAIOR. Se forem iguais, imprima "números iguais".
        int numero01 = 16;
        int numero02 = 16;;

        if (numero01 > numero02){
            System.out.println("O número maior é o: "+numero01);
        } else if (numero02 > numero01){
            System.out.println("O número maior é o: "+numero02);
        }else {
            System.out.println("Números iguais");
        }
    }
}
