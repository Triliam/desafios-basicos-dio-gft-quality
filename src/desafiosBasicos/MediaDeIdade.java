package desafiosBasicos;

import java.util.Scanner;

public class MediaDeIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        int somaIdades = idade1 + idade2 + idade3;
        int mediaIdades = somaIdades / 3;

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("Jovem!");
        }
        if (mediaIdades >= 26 && mediaIdades <= 60) {
            System.out.println("Adulta!");
        }
        if (mediaIdades > 60) {
            System.out.println("Idosa!");
        }
    }
}
