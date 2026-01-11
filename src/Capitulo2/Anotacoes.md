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

## Quando usar cada uma?

- **Arrays**: quando precisa de muitas leituras e poucas inserções
- **Listas Encadeadas**: quando precisa de muitas inserções/remoções e poucas leituras

### Tempos de execução para as operções mais comuns

|          | Arrays | Listas |
|----------|--------|--------|
| Leitura  | O(1)   | O(n)   |
| Inserção | O(n)   | O(1)   |
| Deleção  | O(n)   | O(1)   |
