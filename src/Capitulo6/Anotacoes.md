# Capítulo 6 - Grafos e Pesquisa em Largura (BFS)

## Grafos

- **Grafo**: estrutura composta por **vértices** (nós) e **arestas** (conexões)
- Modela relações/conexões entre elementos
- Exemplo: rede social (pessoas = vértices, amizades = arestas)

## Pesquisa em Largura (Breadth-First Search)

A pesquisa em largura responde duas perguntas:
1. **Existe um caminho** do vértice A até o vértice B?
2. **Qual o caminho mínimo** do vértice A até o vértice B?

### Como funciona

- Procura primeiro nos **vizinhos de 1º grau** (amigos diretos)
- Depois nos **vizinhos de 2º grau** (amigos dos amigos)
- E assim sucessivamente...
- Garante encontrar o **caminho mais curto**



## Implementação

### Estruturas necessárias:

1. **Tabela Hash (Map)**: para representar o grafo e suas relações
   ```java
   Map<String, List<String>> grafo = new HashMap<>();
   grafo.put("voce", List.of("alice", "bob", "claire"));
   ```

2. **Fila (Queue)**: para processar vértices na ordem correta
    - Princípio **FIFO** (First In, First Out)
    - Garante que procuramos por grau (1º grau, depois 2º grau...)
    - **Essencial** para encontrar o caminho mínimo

3. **Lista de verificados**: para não processar o mesmo vértice duas vezes

### Algoritmo:

1. Adiciona vizinhos do vértice inicial na fila
2. Enquanto a fila não estiver vazia:
    - Remove pessoa da fila
    - Se ainda não foi verificada:
        - Verifica se é o objetivo (vendedor)
        - Se não, adiciona seus vizinhos na fila
        - Marca como verificada

## Complexidade

- **Tempo**: O(V + E) - onde V = vértices e E = arestas
- Cada vértice é verificado uma vez
- Cada aresta é percorrida uma vez

## Por que usar Fila?

Se não usarmos fila (FIFO), perdemos a garantia do **caminho mínimo**. A fila garante que processamos por "camadas" de distância.