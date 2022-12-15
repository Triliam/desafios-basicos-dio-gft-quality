package desafiosBasicos;

import java.util.Scanner;

public class FilaDoBanco {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner scan = new Scanner(System.in);
        String nome;


        for (int i = 0; i < nomesFila.length; i++) {
            nome = scan.next();
            nomesFila[i] = nome;
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
        }
    }
}
