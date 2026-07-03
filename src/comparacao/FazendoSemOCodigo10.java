package comparacao;

public class FazendoSemOCodigo10 {
    public static void main(String[] args) {
        int vidas = 3;
        boolean jogoAtivo = true;
        vidas--;
        vidas--;
        vidas--;
        boolean gameOver = vidas == 0 && jogoAtivo;
        System.out.println("Vidas " + vidas);
        System.out.println("gameOver" + gameOver);
    }
}
