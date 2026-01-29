# Capítulo 8 - Algoritmos Gulosos

## Conceito

- **Algoritmo Guloso**: escolhe a melhor opção local em cada etapa
- Busca uma **solução ótima local** esperando chegar em uma **solução ótima global**
- Usado quando calcular a solução exata é **impossível ou muito demorado**

## Problema da Cobertura de Conjuntos

### Cenário
- Programa de rádio quer atingir ouvintes em todos os 50 estados americanos
- Cada estação cobre alguns estados (com sobreposição)
- Objetivo: minimizar o número de estações necessárias

### Solução Exata (Impraticável)
1. Listar **todos os subconjuntos possíveis** de estações (conjunto de partes)
2. Escolher o menor conjunto que cubra todos os estados
3. **Problema**: existem **2^n** subconjuntos possíveis
4. **Complexidade**: O(2^n) - tempo exponencial!

### Solução Gulosa (Aproximação)
1. Escolha a estação que cobre o **maior número de estados ainda não cobertos**
2. Repita até todos os estados estarem cobertos
3. **Complexidade**: O(n²)

### Implementação
```java
while (!estadosAbranger.isEmpty()) {
    // Encontra estação que cobre mais estados não cobertos
    for (var estacao : estacoes.entrySet()) {
        var coberto = new HashSet<>(estadosAbranger);
        coberto.retainAll(estacao.getValue()); // Interseção
        
        if (coberto.size() > estadosCobertos.size()) {
            melhorEstacao = estacao.getKey();
        }
    }
    // Remove estados cobertos e adiciona estação escolhida
}
```

## Algoritmos de Aproximação

São avaliados por:
1. **Rapidez** de execução
2. **Proximidade** da solução ideal


## Problemas NP-Completos


- Problemas **notoriamente difíceis** de resolver
- Nenhum algoritmo conhecido resolve rapidamente
- Exemplos: Caixeiro-viajante, Cobertura de conjuntos

### Caixeiro-Viajante
- Visitar N cidades pelo caminho mais curto
- **Solução exata**: calcular todas as rotas possíveis
- **Rotas possíveis**: N! (fatorial)
    - 5 cidades = 120 rotas
    - 10 cidades = 3.628.800 rotas
    - 20 cidades = 2.432.902.008.176.640.000 rotas

### Como identificar problemas NP-completos?

 **Indicativos:**
- Algoritmo rápido para poucos itens, mas **muito lento** com mais itens
- Precisa calcular **"todas as combinações de X"**
- Precisa calcular **"cada possível versão"** sem poder dividir em subproblemas
- Envolve uma **sequência difícil** de resolver (ex: sequência de cidades)
- Envolve um **conjunto difícil** de resolver (ex: conjunto de estações)
- Pode ser reescrito como cobertura de conjuntos ou caixeiro-viajante

### O que fazer com problemas NP-completos?
- **Pare de tentar a solução perfeita**
- Use um **algoritmo de aproximação** (como algoritmo guloso)
- Aceite uma **boa solução** ao invés da solução ótima

### Exemplo: Aproximação para Caixeiro-Viajante
1. Escolha aleatoriamente uma cidade inicial
2. Sempre vá para a **cidade não visitada mais próxima**
3. Resultado: caminho curto (mas talvez não o mais curto possível)