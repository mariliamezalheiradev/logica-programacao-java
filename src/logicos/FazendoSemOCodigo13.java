package logicos;

public class FazendoSemOCodigo13 {
    public static void main(String[] args) {
        int imc = 23;
        if (imc < 18){
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18 && imc < 24) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
