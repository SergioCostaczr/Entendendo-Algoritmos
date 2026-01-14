# Capítulo 2 - Arrays e Listas Encadeadas

## Arrays

- **Armazenamento**: elementos guardados de forma **contígua** na memória (um do lado do outro)
- **Acesso**: O(1) - acesso instantâneo a qualquer elemento pelo índice
- **Inserção**: O(n) - no pior caso, precisa mover todos os elementos
- **Remoção**: O(n) - mesma razão da inserção
- **Vantagem**: leitura rápida, acesso aleatório eficiente
- **Desvantagem**: inserções e remoções custosas, desperdício de memória se alocar espaço extra

## Listas Encadeadas

- **Armazenamento**: elementos podem estar em **qualquer lugar** da memória
- **Estrutura**: cada elemento armazena o valor + endereço do próximo elemento
- **Acesso**: O(n) - precisa percorrer desde o início
- **Inserção**: O(1) - apenas ajusta os ponteiros/referências
- **Remoção**: O(1) - apenas ajusta os ponteiros/referências
- **Tamanho**: **dinâmico** - cresce conforme necessário
- **Vantagem**: inserções e remoções rápidas, sem desperdício de memória
- **Desvantagem**: leitura lenta, sem acesso aleatório, usa memória extra para armazenar referências

**Discursão sobre Melhores e Piores cenários:**

### Read 
- Melhor: O(1) Muito comum acessar Head ou Tail (Se for umaDouble LinkedList teremos ponteiros para ambos).
- Pior: O(n) Se quisermos acessar um elemento no meio dela teremos que percorrê-la

### Insert
- Melhor: O(1) Bastante comum Insert no início ou fim, como já temos a referência o tempo é constante.
- Pior: O(n) Se quisermos inserir no meio, teremos que percorrê-la para encontrar a referência, caso não a tenhamos. O tempo para encontrar será read(O(n)), o tempo de inserção a partir do momento que temos a referência é O(1).

Então é O(n) ou O(1)? o look up para encontrar a referência é O(n), porem se já tivermos ela é O(1), acho valido considerar como O(n).

### Delete
- Melhor: O(1) Igual no Insert.
- Pior: O(n) Mesma discussão do insert, se tivermos a referencia é simples, caso nao a tenhamos entao sera O(n) porque precisamos fazer o lookup(read).

(Sim, em big O falamos do pior caso, mas como são casos de uso MUITO comum para uma LinkedList é valido entendê-los)

## Quando usar cada uma?

- **Arrays**: quando precisa de muitas leituras e poucas inserções
- **Listas Encadeadas**: quando precisa de muitas inserções/remoções e poucas leituras

### Tempos de execução para as operções mais comuns

|          | Arrays | Listas |
|----------|--------|--------|
| Leitura  | O(1)   | O(n)   |
| Inserção | O(n)   | O(1)   |
| Deleção  | O(n)   | O(1)   |
