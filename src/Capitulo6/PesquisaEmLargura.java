package Capitulo6;

import java.util.*;

public class PesquisaEmLargura {
    private static Map<String, List<String>> graph = new HashMap<>();

    private static boolean search(String name){
        Queue<String> buscarFila = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();

        while (!buscarFila.isEmpty()){
            String pessoa = buscarFila.remove();

            if (!searched.contains(pessoa)){
                if (eVendedor(pessoa)){
                    System.out.println(pessoa + " é vendedor de manga!");
                    return true ;
                } else {
                    buscarFila.addAll(graph.get(pessoa));
                    searched.add(pessoa);
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
//     Map<String, List<String>> grafo = new HashMap<>();
//     grafo.put("voce", new ArrayList<>(Arrays.asList("aline","bob","claire")));
//     System.out.println(grafo.get("voce"));
//     grafo.get("voce").add("pedro");
//     System.out.println(grafo.get("voce"));

        Map<String, List<String>> grafo2 = new HashMap<>();
        grafo2.put("voce", new ArrayList<>(List.of("alice","claire","bob")));
        grafo2.put("bob", new ArrayList<>(List.of("anuj","peggy")));
        grafo2.put("alice", new ArrayList<>(List.of("peggy")));
        grafo2.put("claire", new ArrayList<>(List.of("thom","jonny")));
        grafo2.put("anuj", Collections.emptyList());
        grafo2.put("peggy", Collections.emptyList());
        grafo2.put("thom", Collections.emptyList());
        grafo2.put("jonny",Collections.emptyList());
        //Anuj, Peggy, Thom e Jonny não têm vizinhos. Digrafo.

        Queue<String> fila = new ArrayDeque<>();
        fila.addAll(grafo2.get("voce"));
        List<String> verificadas = new ArrayList<>();

        while (!fila.isEmpty()){
            String pessoa = fila.remove();

            if (!verificadas.contains(pessoa)){
                if (eVendedor(pessoa)){
                    System.out.println(pessoa + " é vendedor de manga!");
                    return;
            }else{
                fila.addAll(grafo2.get(pessoa));
                verificadas.add(pessoa);
            }
            }
        }
    }
    static boolean eVendedor(String nome){
        return nome.endsWith("m");
    }
}
