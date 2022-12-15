package desafiosBasicos;

import java.util.*;

public class PercentualDesconto {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt(); //valor do produto
        int D = input.nextInt(); // valor do produto com o desconto
        int V = M - D;
        int Z = (D * 100) / M;

        System.out.println("O desconto foi de " + (100 - Z) + "%");
    }
}

