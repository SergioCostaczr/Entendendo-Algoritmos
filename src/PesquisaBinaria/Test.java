package PesquisaBinaria;

public class Test {
    public static void main(String[] args) {
        System.out.println(pesquisaBinaria(new int[]{1,3,4,9}, 7));
        System.out.println(operacoes);
    }

    //O(log n)
    public static int operacoes = 0;
    static int pesquisaBinaria(int [] list, int item){

        int alto = list.length - 1;
        int baixo = 0;
        while (baixo <= alto){
            operacoes++;
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
            if (chute == item){
                return meio;
            }
            else if (chute > item) {
                alto = meio -1;
            }
            else {
                baixo = meio + 1;
            }

        }
        return -1;
    }
}
