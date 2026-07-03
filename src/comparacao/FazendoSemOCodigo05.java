package comparacao;

public class FazendoSemOCodigo05 {
    public static void main(String[] args) {
       int idade = 16;
       boolean autorizacaoDoResponsavel = true;
       boolean podeEntrarNaAcademia = idade >= 16 && autorizacaoDoResponsavel;
        System.out.println("Posso entrar na academia? " + podeEntrarNaAcademia);
    }
}
