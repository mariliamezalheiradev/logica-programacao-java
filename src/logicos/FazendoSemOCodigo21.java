package logicos;

public class FazendoSemOCodigo21 {
    public static void main(String[] args) {
        boolean usuarioAtivo = true;
        boolean emailConfirmado = true;

        boolean podeAcessar = (usuarioAtivo && emailConfirmado);
        System.out.println("Esté usuario pode acessar a conta? " + podeAcessar);
    }
}
