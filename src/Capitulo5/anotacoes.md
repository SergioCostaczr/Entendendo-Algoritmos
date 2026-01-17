# Capítulo 5 - Tabelas Hash

## Conceito

- **Tabela Hash**: estrutura de dados que mapeia chaves a valores
- Usa uma **função hash** para calcular onde armazenar cada valor
- Acesso extremamente rápido aos dados

## Casos de Uso

- Lista telefônica (nome → número)
- Catálogo de preços (produto → preço)
- **Cache/Caching**: armazena respostas para evitar processamento repetido no servidor


## Colisões

- **Colisão**: quando duas chaves diferentes geram o mesmo índice
- **Solução**: usar lista encadeada em cada posição
- Lista deve ser **pequena**, senão a tabela fica inútil
- Evitar com uma **boa função hash**

## Desempenho

|           | Caso Médio | Pior Caso |
|-----------|------------|-----------|
| Busca     | O(1)       | O(n)      |
| Inserção  | O(1)       | O(n)      |
| Remoção   | O(1)       | O(n)      |

## Fator de Carga

- **Fator de carga** = número de itens / total de espaços
- Manter fator de carga **≤ 0.7** para boa performance
- Quando ultrapassa, fazer **redimensionamento** (resize) da tabela