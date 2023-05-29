package br.unicap.listaTipoAbstrato;
class Node<T> {
    private T info;
    private Node<T> prox;
    Node(T nvInfo) {
        this.info = nvInfo;
    }
    T getInfo() {
        return this.info;
    }
    Node<T> getProx() {
        return this.prox;
    }
    void setInfo(T nvInfo) {
        this.info = nvInfo;
    }
    void setProx(Node<T> nvProx) {
        this.prox = nvProx;
    }
}