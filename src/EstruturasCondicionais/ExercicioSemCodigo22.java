package EstruturasCondicionais;

public class ExercicioSemCodigo22 {
    public static void main(String[] args) {
        int idade = 16;

        if (idade < 12){
            System.out.println("Categoria Infantil");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
