package logicos;

public class FazendoSemOCodigo10 {
    public static void main(String[] args) {
        int velocidade = 85;
        if (velocidade < 60){
            System.out.println("Devagar!");
        } else if (velocidade >= 60 && velocidade < 100){
            System.out.println("Velocidade normal.");
        } else {
            System.out.println("Acima do limite!");
        }
    }
}
