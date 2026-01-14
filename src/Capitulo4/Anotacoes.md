# Capítulo 4 - Quicksort e Dividir para Conquistar (D&C)

## Dividir para Conquistar (Divide and Conquer)

- **Técnica D&C**: dividir um problema em problemas menores
- Algoritmos D&C são **recursivos**
- D&C **não é um algoritmo**, é uma **maneira de pensar** sobre o problema
- Passos:
    1. Descobrir o **caso base** (o mais simples possível)
    2. **Dividir/diminuir** o problema até chegar no caso base

### Exemplo: Soma de Array com D&C
```
soma([2, 4, 6])
= 2 + soma([4, 6])
= 2 + 4 + soma([6])
= 2 + 4 + 6 + soma([])  ← caso base
= 2 + 4 + 6 + 0
= 12
```

**Caso base**: array vazio ou com 1 elemento
**Caso recursivo**: primeiro elemento + soma do restante

## Quicksort

### Como funciona
1. Escolhe um **pivô** do array
2. **Particiona**: elementos menores que o pivô | pivô | elementos maiores que o pivô
3. Aplica quicksort **recursivamente** nos subarrays

```
[33, 15, 10, 50, 25]  ← escolhe pivô = 33
[15, 10, 25] | 33 | [50]  ← particiona
quicksort([15, 10, 25]) + [33] + quicksort([50])
```

**Caso base**: array com 0, 1 ou 2 elementos (já ordenado ou fácil ordenar)

## Complexidade

- **Pior caso**: O(n²) - quando o pivô é sempre o menor ou maior elemento
- **Caso médio**: O(n log n) - quando o pivô divide bem o array
- **Na prática**: Quicksort é mais rápido que Merge Sort

### Por que Quicksort é mais rápido na prática?

**Constante (c)** faz diferença:
- Merge Sort: c maior × O(n log n)
- Quicksort: c menor × O(n log n)
- Quicksort tem constante menor e funciona no caso médio na maioria das vezes

## Caso Médio vs Pior Caso

### Altura da pilha de recursão:
- **Melhor caso**: O(log n) - pilha de altura 4 para 8 elementos
- **Pior caso**: O(n) - pilha de altura 8 para 8 elementos

### Tempo total:
- Cada nível da pilha processa **O(n)** elementos
- **Melhor caso**: O(n) × log n níveis = **O(n log n)**
- **Pior caso**: O(n) × n níveis = **O(n²)**

### Visualização da pilha:
```
Melhor caso (log n níveis):
[1,2,3,4,5,6,7,8]
    ↓ pivô central
[1,2,3,4] [5,6,7,8]
  ↓           ↓
...          ...
Altura: log n

Pior caso (n níveis):
[1,2,3,4,5,6,7,8]
    ↓ pivô sempre menor
[2,3,4,5,6,7,8]
    ↓
[3,4,5,6,7,8]
    ↓
...
Altura: n
```