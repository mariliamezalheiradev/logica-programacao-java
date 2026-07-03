package logicos;

public class FazendoSemOCodigo16 {
    public static void main(String[] args) {
        boolean temLogin = true;
        boolean temSenha = true;

        boolean acessarSistema = temLogin && temSenha;
        System.out.println("O cliente pode acessar sistema? " + acessarSistema);
    }
}
