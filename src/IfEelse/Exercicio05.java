package IfEelse;

public class Exercicio05 {
    public static void main(String[] args) {
        int temperatura = 25;

        if (temperatura > 30) {
            System.out.println("Está Calor");
        } else if (temperatura >= 25 && temperatura <= 30) {
            System.out.println("Está agradável");
        } else {
            System.out.println("Está frio");
        }
    }
}
