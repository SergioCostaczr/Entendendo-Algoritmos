# Capítulo 3 - Recursão

## Conceito de Recursão

- **Recursão**: quando uma função chama a si mesma
- Toda função recursiva tem **duas partes**:
    - **Caso base**: quando a função NÃO chama a si mesma (condição de parada)
    - **Caso recursivo**: quando a função chama a si mesma
- Sem caso base, a recursão vira um **loop infinito**

## Pilha (Stack)

- **Push**: adicionar item no topo da pilha
- **Pop**: remover item do topo da pilha
- **LIFO**: Last In, First Out (último a entrar, primeiro a sair)

## Pilha de Chamadas (Call Stack)

- Cada chamada de função é adicionada à pilha
- Quando uma função termina, ela é removida da pilha
- A pilha mantém o controle de onde o programa deve retornar

### Exemplo: Pilha de Chamadas
```

                                                               [SAUDA 2     ]      
sauda(nome)                                                    [nome: Maria ]     [TCHAU       ]      
  └─> sauda2(nome)  //    [SAUDA      ]                        [SAUDA       ]     [SAUDA       ]     [SAUDA       ]                
  └─> tchau()       //    [nome: Maria] chamada de função->    [nome: Maria ] ->  [nome: Maria ]  -> [nome: Maria ]                       
  
  
  
```

## O Problema do Monte de Caixas

Exemplo da busca recursiva em caixas:
```
Caixa A (contém B, C)
  └─> Caixa B (contém D)
      └─> Caixa D (vazia) ✓ retorna
  └─> Caixa C ← próxima a analisar
```

**Pilha durante a execução:**
```
Caixa D      []
Caixa B      []
Caixa A      [C]  ← ainda tem C para analisar
```

## Custo da Recursão

- Usar pilha é **conveniente** - não precisa gerenciar manualmente
- Mas tem um **custo**: cada chamada ocupa memória
- Pilha muito cheia = muita memória usada

### Soluções quando a pilha fica muito grande:
1. **Reescrever com loops** (iteração)
2. **Tail recursion** (recursão de cauda)
    - Técnica avançada
