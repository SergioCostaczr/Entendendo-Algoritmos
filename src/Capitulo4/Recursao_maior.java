package Capitulo4;

import java.util.Arrays;

public class Recursao_maior {
    static int maior(int [] lista, int maior, int indice){
        if (lista[indice] > maior){
            maior = lista[indice];
        }
        if (indice == lista.length -1){
            return maior;
        }
        indice +=1;
        return  maior(lista,maior,indice);
    }
    private static int max(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }

        int subMax = max(Arrays.copyOfRange(list, 1, list.length));
        return list[0] > subMax ? list[0] : subMax;
    }

    public static void main(String[] args) {

    }
}
