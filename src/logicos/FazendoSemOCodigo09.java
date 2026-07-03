package logicos;

public class FazendoSemOCodigo09 {
    public static void main(String[] args) {
        int hora = 14;
        if (hora < 12){
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
