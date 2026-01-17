package Capitulo5;

import java.util.HashMap;
import java.util.Map;

public class TabelaHash {
    public static void main(String[] args) {
        //Map<String, Double> book = new HashMap<String,Double>();
        //book.put("maçã", 0.67);
        //book.put("leite", 1.89);
        //book.put("abacate", 1.50);
        //book.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));

        Map<String, Boolean> voted = new HashMap<>();
        verificaEleitor("mike",voted);
        verificaEleitor("tom",voted);
        verificaEleitor("mike",voted);
    }
    static void verificaEleitor(String nome, Map<String, Boolean> voted){
        if (voted.getOrDefault(nome,false)){
            System.out.println("Mande embora");
        } else {
            voted.put(nome,true);
            System.out.println("Deixe votar");
        }
    }
}
