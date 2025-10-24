#  Listas Encadeadas em Java

##  Objetivo
Este projeto tem como objetivo consolidar os conhecimentos sobre **estruturas de dados dinâmicas** por meio da implementação manual de **listas encadeadas** em Java.

O foco é compreender o funcionamento de **nós (nodes)** e **referências (ponteiros)**, além de realizar as operações fundamentais de **inserção**, **remoção**, **busca** e **listagem** em cada tipo de lista.

---

##  Estruturas Implementadas


###  1. Lista Encadeada Simples (`ListaSimples`)
- Cada nó armazena um valor e uma referência para o próximo nó.
- Acesso sequencial: sempre inicia do primeiro nó.
- Operações implementadas:
  - Inserir no início, meio e fim;
  - Remover elemento;
  - Buscar elemento;
  - Exibir todos os elementos da lista.

###  2. Lista Duplamente Encadeada (`ListaDupla`)
- Cada nó possui duas referências: uma para o **próximo** e outra para o **anterior**.
- Permite navegação em ambos os sentidos.
- Operações implementadas:
  - Inserir no início, meio e fim;
  - Remover elemento;
  - Buscar elemento;
  - Listar elementos de forma direta e reversa.

###  3. Lista Encadeada Circular (`ListaCircular`)
- O último nó aponta novamente para o primeiro, formando um ciclo.
- Ideal para estruturas de repetição contínua.
- Operações implementadas:
  - Inserir elementos;
  - Remover elemento;
  - Buscar elemento;
  - Exibir a lista completa em ciclo.

---

##  Requisitos de Implementação
Cada estrutura foi construída **manualmente**, utilizando:
- Classes próprias (`Node`, `Lista`, `Main`, etc.);
- Ponteiros (referências como `inicio`, `proximo`, `anterior`, `fim`);

---
   ```bash
   git clone https://github.com/dvsxx11/Listas-encadeadas.git
