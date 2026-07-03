package aritmeticos;

public class FazendoSemOCodigo05 {
    public static void main(String[] args) {
        // quando for se referer a somente 1 vez, usar -- ou ++, se for se referer mais de 2 vezes, usar += ou -=
        int carros = 0;
        carros++; // carro 1
        carros += 3; // carro 1
        carros--; // carro 1
        carros += 2; // carro 1
        carros -= 4; // carro 1
        carros++; // carro 1
        carros -= 2; // carro 1
        System.out.println("Total de carros no estacionamento: " + carros);
    }
}
