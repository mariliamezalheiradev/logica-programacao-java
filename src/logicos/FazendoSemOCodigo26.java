package logicos;

public class FazendoSemOCodigo26 {
    public static void main(String[] args) {
        boolean temInternet = true;
        boolean sistemaOnline = true;

        boolean acessarSite = ( temInternet && sistemaOnline );
        System.out.println("Consigo acessar o site? " + acessarSite);
    }
}
