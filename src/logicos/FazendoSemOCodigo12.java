package logicos;

public class FazendoSemOCodigo12 {
    public static void main(String[] args) {
        int pontos = 1200;
        if (pontos < 500){
            System.out.println("Bronze");
        } else if (pontos >= 500 && pontos < 1000) {
            System.out.println("Prata");
        } else {
            System.out.println("Ouro");
        }
    }
}
