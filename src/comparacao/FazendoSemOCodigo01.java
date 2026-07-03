package comparacao;

public class FazendoSemOCodigo01 {
    public static void main(String[] args) {
        int hora = 14;
        boolean estaAberto = true;
        boolean podeEntrar = hora <= 18 && estaAberto == true;
        System.out.println("Pode entrar? " + podeEntrar);
    }
}
