package Capitulo2;

import java.util.Arrays;

public class OrdenarLista {
    static int buscarMenor(int [] lista){
        int menor = lista[0];
        int menorIndice = 0;
        for (int i = 1; i < lista.length; i++){
            if (lista[i] < menor){
                menor = lista[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    static int [] ordenarPorSelecao (int [] lista){
        int [] novoArr = new int[lista.length];
        for (int i = 0; i < lista.length; i++){
            int menor = buscarMenor(lista);
            novoArr[i] = lista[menor];
            lista[menor] = Integer.MAX_VALUE;
        }
        return novoArr;
    }

    public static void main(String[] args) {
        int [] lista = {7,2,7,6,8,9};

        System.out.println(Arrays.toString(ordenarPorSelecao(lista)));
    }
}
