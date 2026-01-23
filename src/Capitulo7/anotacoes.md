# Capítulo 7 - Algoritmo de Dijkstra

## Conceito

- **Algoritmo de Dijkstra**: encontra o **caminho de menor custo** em um grafo ponderado
- Diferente da BFS que encontra o caminho com **menos arestas**
- Usado quando as arestas têm **pesos/custos diferentes**

## Estruturas Necessárias

### 1. Tabela Grafo (Graph)
```java
Map<String, Map<String, Double>> graph
```
- Cada nó tem uma tabela hash com seus vizinhos e o custo da aresta
- Exemplo:
    - `inicio → a (custo 6)` e `inicio → b (custo 2)`
    - `b → a (custo 3)` e `b → fim (custo 5)`

### 2. Tabela de Custos (Costs)
```java
Map<String, Double> costs
```
- Armazena o **custo total** para chegar em cada nó a partir do início
- Atualizada conforme encontramos caminhos mais baratos
- Nós desconhecidos iniciam com `Double.POSITIVE_INFINITY`

### 3. Tabela de Pais (Parents)
```java
Map<String, String> parents
```
- Registra de **qual nó viemos** para chegar em cada nó
- Permite reconstruir o caminho completo no final

### 4. Lista de Processados
```java
List<String> processed
```
- Evita processar o mesmo nó mais de uma vez

## Como Funciona o Algoritmo

1. **Encontra o nó de menor custo** que ainda não foi processado
2. **Atualiza os custos** dos vizinhos desse nó:
    - Se `custo atual do nó + custo da aresta < custo do vizinho`
    - Atualiza o custo do vizinho
    - Atualiza o pai do vizinho
3. **Marca o nó como processado**
4. **Repete** até processar todos os nós

### Exemplo de Execução:
```
Início → a (6), b (2)
Processa b (menor custo = 2):
  - b → a (3): novo custo = 2 + 3 = 5 < 6 ✓ atualiza!
  - b → fim (5): novo custo = 2 + 5 = 7
  
Processa a (custo = 5):
  - a → fim (1): novo custo = 5 + 1 = 6 < 7 ✓ atualiza!

Resultado: início → b → a → fim (custo total = 6)
```

## Complexidade

- **Tempo**: O((V + E) log V) com heap
- **Tempo**: O(V²) com busca linear (implementação simples)

## Limitação Importante

⚠️ **Não funciona com arestas de peso negativo!**
- Para grafos com pesos negativos, use o **Algoritmo de Bellman-Ford**