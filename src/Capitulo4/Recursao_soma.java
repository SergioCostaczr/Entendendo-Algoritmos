package Capitulo4;

import java.util.Arrays;
import java.util.List;

public class Recursao_soma {
    private static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    static int soma(List<Integer> a){
        if (a.size()==1){
            return a.getFirst();
        }
        int first = a.getFirst();
        a.removeFirst();

        return first + soma(a);
    }

    public static void main(String[] args) {

    }
}
