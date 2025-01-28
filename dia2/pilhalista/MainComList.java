package dia2.pilhalista;

public class MainComList {
    public static void main(String[] args) {
        PilhaComList pilha = new PilhaComList();

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