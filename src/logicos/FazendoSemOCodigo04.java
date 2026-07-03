package logicos;

public class FazendoSemOCodigo04 {
    public static void main(String[] args) {
        double cupomDeDesconto = 150;
      if (cupomDeDesconto >= 150){
          cupomDeDesconto *= 0.82;
      } else {
          cupomDeDesconto *= 0.93;
      }
        System.out.println("Valor do cupom de desconto ficou? " + cupomDeDesconto);
    }
}
