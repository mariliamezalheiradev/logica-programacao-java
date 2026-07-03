package logicos;

public class FazendoSemOCodigo11 {
    public static void main(String[] args) {
        int nota = 55;
        if (nota >= 70){
            System.out.println("Aprovado!");
        } else if (nota >= 50 && nota < 70) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
