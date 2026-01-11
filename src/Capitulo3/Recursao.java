package Capitulo3;

public class Recursao {
    static void regressiva(int item){
        System.out.println(item);

        if (item == -10){ //Caso-base
            return;
        }
        regressiva(item-1); //Caso recursivo
    }

    static void sauda(String name){
        System.out.println("Ola, "+ name+"!");
        sauda2(name);
        System.out.println("Preparando para dizer tchau....");
        tchau();
        System.out.println("fim do metodo sauda");
    }

    static void sauda2(String name){
        System.out.println("Como vai "+ name+"?");
    }
    static void tchau(){
        System.out.println("Ok, tchau!");
    }

    static int fat(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fat(x-1);
    }

    public static void main(String[] args) {
        System.out.println(fat(3));
    }
}
