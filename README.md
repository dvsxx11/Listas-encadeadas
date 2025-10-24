#  Listas Encadeadas em Java

##  Objetivo
Este projeto tem como objetivo consolidar os conhecimentos sobre **estruturas de dados dinâmicas** por meio da implementação manual de **listas encadeadas** em Java.

O foco é compreender o funcionamento de **nós (nodes)** e **referências (ponteiros)**, além de realizar as operações fundamentais de **inserção**, **remoção**, **busca** e **listagem** em cada tipo de lista.


---


##  Estruturas Implementadas


1. Lista Encadeada Simples (`ListaSimples`)
A **lista encadeada simples** é formada por uma sequência de nós, onde **cada nó armazena um valor e uma referência para o próximo**.  
Ela permite percorrer os elementos em **apenas um sentido** — do primeiro até o último.

### Operações implementadas:
- **Inserir no início**: adiciona um novo nó no começo da lista.  
- **Inserir no fim**: percorre até o último nó e adiciona o novo elemento.  
- **Inserir no meio**: insere um nó em uma posição específica.  
- **Remover elemento**: exclui um nó com determinado valor.  
- **Buscar elemento**: verifica se um valor está presente.  
- **Listar elementos**: exibe todos os nós armazenados.

2. Lista Duplamente Encadeada (`ListaDupla`)
A **lista duplamente encadeada** possui nós com **duas referências**:
- `anterior` → aponta para o nó anterior;
- `proximo` → aponta para o próximo nó.

Isso permite **navegação nos dois sentidos**, facilitando operações de remoção e inserção em qualquer ponto.

### Operações implementadas:
- Inserir no início, meio ou fim;
- Remover elemento;
- Buscar elemento;
- Listar elementos de forma **direta e reversa**.


3. Lista Encadeada Circular (`ListaCircular`)
A **lista circular** é semelhante à lista simples, com a diferença de que **o último nó aponta novamente para o primeiro**, formando um ciclo.  
Isso permite percorrer a lista de maneira contínua, sem precisar reiniciar manualmente.

###  Operações implementadas:
- Inserir elementos (no início, meio ou fim);
- Remover elemento;
- Buscar elemento;
- Exibir todos os elementos em forma circular.



---
##  Conceitos Utilizados

Cada estrutura foi construída utilizando: 

- **Classe Node:** responsável por armazenar o valor do elemento e as referências (`proximo` e/ou `anterior`);
- **Classe Lista:** implementa os métodos de inserção, remoção, busca e exibição;
- **Classe Main:** contém o menu interativo e os testes das operações;
- **Referências (ponteiros):** utilizadas para conectar os nós da lista.

---
