package dia2.pilhalista;

import dia2.PilhaTAD;

public class MainComList {
    public static void main(String[] args) {
        PilhaTAD pilha = pilha();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        pilha.mostrar();

        System.out.println("Topo: " + pilha.peek());

        System.out.println("Desempilhando: " + pilha.pop());
        System.out.println("Topo após desempilhar: " + pilha.peek());

        pilha.mostrar();
    }

     private static PilhaTAD pilha(){
        return new PilhaComList();
    }
}