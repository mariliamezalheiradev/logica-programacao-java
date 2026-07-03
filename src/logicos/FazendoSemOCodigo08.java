package logicos;

public class FazendoSemOCodigo08 {
    public static void main(String[] args) {
        int idade = 16;
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}
