package listasimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;

        do {
            System.out.println("\n=== LISTA SIMPLES ===");
            System.out.println("1. Inserir no início");
            System.out.println("2. Inserir no final");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Remover elemento");
            System.out.println("5. Listar elementos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir no início: ");
                    valor = scanner.nextInt();
                    lista.inserirInicio(valor);
                    break;

                case 2:
                    System.out.print("Digite o valor para inserir no final: ");
                    valor = scanner.nextInt();
                    lista.inserirFinal(valor);
                    break;

                case 3:
                    System.out.print("Digite o valor para buscar: ");
                    valor = scanner.nextInt();
                    boolean encontrou = lista.buscar(valor);
                    System.out.println("Elemento " + valor + (encontrou ? " encontrado!" : " não encontrado!"));
                    break;

                case 4:
                    System.out.print("Digite o valor para remover: ");
                    valor = scanner.nextInt();
                    lista.remover(valor);
                    break;

                case 5:
                    lista.listar();
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