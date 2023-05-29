package br.unicap.listaTipoAbstrato;

public class LimitedStack<T> {
    private Node<T> topo;
    private final int cheio;
    private int qnt;

    public LimitedStack(int limite) {
        this.cheio = limite;
    }

    public void Push(T A) {
        Node<T> newInfo = new Node<>(A);
        if (this.isFull()) {
            System.out.println("Pilha atingiu o seu limite.");
            return;
        } else if (!this.isEmpty()) {
            newInfo.setProx(this.topo);
        }
        this.topo = newInfo;
        this.qnt++;
        System.out.println("Inseção realizada.");
    }

    public T Pop() {
        Node<T> aux;
        aux = this.topo;
        this.topo = this.topo.getProx();
        this.qnt--;
        return aux.getInfo();
    }

    public void show() {
        Node<T> aux;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia.");
            return;
        }
        aux = this.topo;
        do {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        } while (aux != null);
    }

    public void Cancel(T A) {
        Node<T> aux, post;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia.");
            return;
        } else if (this.topo.getInfo() == A) {
            this.topo = this.topo.getProx();
            this.qnt--;
            System.out.println("Remoção realizada.");
            return;
        }
        aux = this.topo;
        post = this.topo.getProx();
        do {
            if (post.getInfo() == A) {
                aux.setProx(post.getProx());
                this.qnt--;
                System.out.println("Remoção realizada.");
                return;
            }
            aux = aux.getProx();
            post = post.getProx();
        } while(aux.getProx() != null);
        System.out.println("Valor não listado.");
    }

    public boolean isEmpty() {
        return this.topo == null && this.qnt == 0;
    }

    public boolean isFull() {
        return this.qnt == this.cheio;
    }
}
