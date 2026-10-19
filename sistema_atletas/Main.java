package sistema_atletas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);
        AtletaCorrida AtletaCorrida = new AtletaCorrida("Jack", 75.5, 26, "Masculino");
        AtletaCorrida.identificarAtleta();
        System.out.println("");
        AtletaJudo AtletaJudo = new AtletaJudo("Maria", 64.2, 22, "Feminino");
        AtletaJudo.identificarAtleta();
        System.out.println("");
        AtletaNatacao AtletaNatacao = new AtletaNatacao("Ana", 68.4, 26, "Feminino");
        AtletaNatacao.identificarAtleta();
    }
}
