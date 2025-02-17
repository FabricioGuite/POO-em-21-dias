package dia5.Lab04;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> list;

    // Construtor
    public Stack() {
        list = new ArrayList<>();
    }

    // Verifica se a pilha está vazia
    public boolean empty() {
        return list.isEmpty();
    }

    // Retorna o primeiro elemento sem removê-lo
    public Object peek() {
        if (!empty()) {
            return list.get(0);
        }
        return null;
    }

    // Remove e retorna o primeiro elemento
    public Object pop() {
        if (!empty()) {
            return list.remove(0);
        }
        return null;
    }

    // Adiciona um item ao topo da pilha
    public Object push(Object item) {
        list.add(0, item);
        return item;
    }

    // Procura um elemento na pilha e retorna sua posição (1-based)
    public int search(Object o) {
        int index = list.indexOf(o);
        if (index != -1) {
            return index + 1;
        }
        return -1;
    }
}

