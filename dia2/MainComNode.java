package dia2;

public class MainComNode {
    public static void main(String[] args) {
        PilhaComNode pilha = new PilhaComNode();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        pilha.mostrar();

        System.out.println("Topo: " + pilha.peek());

        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Topo após desempilhar: " + pilha.peek());

        pilha.mostrar();
    }
}