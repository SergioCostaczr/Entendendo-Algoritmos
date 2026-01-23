package Capitulo7;

import java.util.HashMap;
import java.util.Map;

public class Capitulo7 {




















    public static void main(String[] args) {

        // Cada chave nessa Map, é um vertice que possui o seu vizinho e o peso da aresta.
        Map<String, Map<String, Double>> grafo = new HashMap<>();

        // Vertice Incio
        grafo.put("Inicio", new HashMap<>());

        grafo.get("Inicio").put("a", 6.0);
        grafo.get("Inicio").put("b", 2.0);

        //Vizinhos de Início.
        System.out.println(grafo.get("Inicio").keySet());

        // Temos arestas para A e B, peso dessas arestas:
        System.out.println(grafo.get("Inicio").get("a"));
        System.out.println(grafo.get("Inicio").get("b"));

        // Vertice a
        grafo.put("a", new HashMap<>());
        // Vizinho de "a" e o peso da aresta
        grafo.get("a").put("fim", 1.0);

        // vetice b
        grafo.put("b", new HashMap<>());

        // Vizinhos de "b" e o peso das arestas
        grafo.get("b").put("a",3.0);
        grafo.get("b").put("fim",5.0);

        //Vertice final não tem vizinhos
        grafo.put("fim",null);


        //Tabela de custos
        Map<String,Double> custos = new HashMap<>();
        custos.put("a", 6.0);
        custos.put("b", 2.0);
        custos.put("fim", Double.POSITIVE_INFINITY);

        //Tabela de pais
        Map<String,String> pais = new HashMap<>();
        pais.put("a","inicio");
        pais.put("b","inicio");
        pais.put("fim",null);








    }



}
