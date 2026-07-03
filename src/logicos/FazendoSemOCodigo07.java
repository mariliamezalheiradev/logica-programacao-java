package logicos;

public class FazendoSemOCodigo07 {
    public static void main(String[] args) {
        double promocaoLoja = 250;
        if (promocaoLoja >= 300){
            promocaoLoja *= 0.78;
        } else {
            promocaoLoja *= 0.98;
        }
        System.out.println("Cupom de desconto: " + promocaoLoja);
    }
}
