package logicos;

public class FazendoSemOCodigo19 {
    public static void main(String[] args) {
        int idade = 19;
        boolean temDocumento = true;

        boolean podeEntrar = (idade >= 18 && temDocumento);
        System.out.println("Está autorizado(a) a entrar? " + podeEntrar);
    }
}
