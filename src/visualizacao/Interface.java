package visualizacao;

import java.util.Scanner;
import br.unicap.listaTipoAbstrato.LimitedStack;

public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LimitedStack<Integer> pilha;
        int limite, num, remove;
        char op;
        System.out.print("Informe o limite para a pilha de números: ");
        limite = in.nextInt();
        pilha = new LimitedStack<>(limite);
        menuPilha();
        do {
            System.out.println("Digite 5 para ver a pilha novamente.");
            System.out.print("Digite a sua opção: ");
            op = in.next().charAt(0);
            if (op == '1') {
                System.out.print("Informe um número inteiro para inseção: ");
                num = in.nextInt();
                pilha.Push(num);
            }
            else if (op == '2') {
                if (pilha.isEmpty()) {
                    System.out.println("Pilha vazia.");
                }
                else {
                    remove = pilha.Pop();
                    System.out.println("O número " + remove + " foi removido do topo da lista.");
                }
            }
            else if (op == '3') {
                pilha.show();
            }
            else if (op == '4') {
                System.out.print("Informe um número inteiro para remoção: ");
                num = in.nextInt();
                pilha.Cancel(num);
            }
            else if (op == '5') {
                menuPilha();
            }
            else if (op == '0') {
                System.out.println("Fim do programa.");
            }
            else {
                System.out.println("Opção inválida.");
            }
            System.out.println();
        } while(op != '0');
    }

    private static void menuPilha() {
        System.out.println("Menu para pilha de números:");
        System.out.println("1 - Inserir um novo valor no topo da pilha.");
        System.out.println("2 - Remover o valor no topo da pilha.");
        System.out.println("3 - Exibir todos os valores listados.");
        System.out.println("4 - Remover um valor específico da pilha.");
        System.out.println("0 - Sair do programa.");
    }
}
