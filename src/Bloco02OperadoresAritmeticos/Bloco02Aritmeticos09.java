package Bloco02OperadoresAritmeticos;

public class Bloco02Aritmeticos09 {
    public static void main(String[] args) {
        // Crie um programa que calcule o índice de massa corporal (IMC) usando: IMC = peso / (altura * altura).
        int imc = 85;
        double altura = 1.80;

        double indiceDeMassa = imc / (altura * altura);
        System.out.println("A índice de massa corporal é: "+indiceDeMassa);
    }
}
