package Capitulo4;

import java.util.Arrays;

public class Recursao_contar {
    private static int count(int[] list) {
        if (list.length == 0) {
            return 0;
        }

        return 1 + count(Arrays.copyOfRange(list, 1, list.length));
    }

    static int contar(int [] lista, int indice){
        if (indice == lista.length){
            return indice;
        }
        indice += 1;
        return contar(lista,indice);
    }

    public static void main(String[] args) {

    }
}
