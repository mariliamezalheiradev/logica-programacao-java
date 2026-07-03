package logicos;

public class FazendoComOCodigo {
    public static void main(String[] args) {
        int idade = 20;
        boolean emailConfirmado = true;
        if (idade >= 18 && emailConfirmado) {
            System.out.println("Cadastro liberado!");
        } else {
            System.out.println("Cadastro Bloqueado.");
        }
    }
}
