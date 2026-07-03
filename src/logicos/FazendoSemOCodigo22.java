package logicos;

public class FazendoSemOCodigo22 {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteira = true;

        boolean podeDirigir = (temCarteira && idade >= 18);
        System.out.println("Está apto para dirigir? " + podeDirigir);

    }
}
