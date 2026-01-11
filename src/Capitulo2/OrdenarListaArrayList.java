package Capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenarListaArrayList {

    static int buscarMenor(List<Integer> list){
        int menor = list.get(0);
        int menorIndice = 0;
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < menor){
                menor = list.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }


    static List<Integer> ordenarPorSelecao (List<Integer> list){
        List<Integer> novoArr = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < listSize; i++){
            int menor = buscarMenor(list);
            novoArr.add(list.get(menor));
            list.remove(menor);
        }
        return novoArr;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(7,2,3,4,0));

        System.out.println(ordenarPorSelecao(list));
    }
}
