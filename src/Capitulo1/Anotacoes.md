# Capítulo 1 - Introdução a Algoritmos

## Big O (Notação Assintótica)

- A notação Big O diz o quão rápido é um algoritmo
- **O(n)** - tempo linear
- **O(log n)** - tempo logarítmico
- Estabelece o tempo de execução no **pior dos casos**
- A rapidez de um algoritmo é medida pelo crescimento do número de operações, não em segundos
- Discutimos sobre o quão rapidamente o tempo de execução aumenta conforme o número de elementos aumenta

## Pesquisa Binária

- **Pré-requisito**: a lista precisa estar **ordenada**
- **Funcionamento**: divide a lista ao meio repetidamente, eliminando metade dos elementos a cada iteração
- **Complexidade**: O(log n) - muito mais eficiente que busca simples O(n)
- **Exemplo**: em uma lista de 1.000.000 elementos, busca binária precisa de no máximo 20 passos (log₂ 1.000.000 ≈ 20)
- **Comparação**: busca simples precisaria de até 1.000.000 de passos no pior caso

### Comparação de Algoritmos
| Elementos | Busca Simples O(n)  | Busca Binária O(log n) |
|-----------|---------------------|------------------------|
| 100       | 100 operações       | 7 operações            |
| 10.000    | 10.000 operações    | 14 operações           |
| 1.000.000 | 1.000.000 operações | 20 operações           |


