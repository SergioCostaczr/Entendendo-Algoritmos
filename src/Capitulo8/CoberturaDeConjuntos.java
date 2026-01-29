package Capitulo8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CoberturaDeConjuntos {
    public static void main(String[] args) {
        Set<String> estadosAbranger = new HashSet<>(Set.of("mt", "wa","or","id","nv","ut","ca","az"));
        Map<String, Set<String>> estacoes = new HashMap<>();

        estacoes.put("kum", new HashSet<>(Set.of("id","nv","ut")));
        estacoes.put("kdois", new HashSet<>(Set.of("wa","id","mt")));
        estacoes.put("ktres", new HashSet<>(Set.of("or","nv","ca")));
        estacoes.put("kquatro",new HashSet<>(Set.of("nv","ut")));
        estacoes.put("kcinco", new HashSet<>(Set.of("ca","az")));

        Set<String> estacoes_final = new HashSet<>();


        while (!estadosAbranger.isEmpty()){
            String melhorEstacao = null;
            var estadosCobertos = new HashSet<String>();

            for (var estacao : estacoes.entrySet()){ // .entrySet retorna um Set onde cada elemento é um Map.Entry(par chave-valor).
                var coberto = new HashSet<>(estadosAbranger);
                coberto.retainAll(estacao.getValue()); // Interseção de conjuntos.

                if (coberto.size() > estadosCobertos.size()){
                    melhorEstacao = estacao.getKey();
                    estadosCobertos = coberto;
                }
            }
            estadosAbranger.removeIf(estadosCobertos::contains);
            if(melhorEstacao != null){
                estacoes_final.add(melhorEstacao);
            }
        }
        System.out.println(estacoes_final);

    }
}
