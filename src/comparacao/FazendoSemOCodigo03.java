package comparacao;

public class FazendoSemOCodigo03 {
    public static void main(String[] args) {
        int notaMinima = 6;
        boolean entregouTrabalho = true;
        boolean podeFazerProva = notaMinima >= 6 && entregouTrabalho;
        System.out.println("Pode fazer a prova? " + podeFazerProva);
    }
}
