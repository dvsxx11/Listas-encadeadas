package listacircular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;

        do {
            System.out.println("\n=== LISTA CIRCULAR ===");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Buscar elemento");
            System.out.println("3. Remover elemento");
            System.out.println("4. Listar elementos");
            System.out.println("5. Mostrar início atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir: ");
                    valor = scanner.nextInt();
                    lista.inserir(valor);
                    break;

                case 2:
                    System.out.print("Digite o valor para buscar: ");
                    valor = scanner.nextInt();
                    boolean encontrou = lista.buscar(valor);
                    System.out.println("Elemento " + valor + (encontrou ? " encontrado!" : " não encontrado!"));
                    break;

                case 3:
                    System.out.print("Digite o valor para remover: ");
                    valor = scanner.nextInt();
                    lista.remover(valor);
                    break;

                case 4:
                    lista.listar();
                    break;

                case 5:
                    int inicio = lista.getInicio();
                    if (inicio != -1) {
                        System.out.println("Início atual da lista: " + inicio);
                    } else {
                        System.out.println("Lista vazia!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}