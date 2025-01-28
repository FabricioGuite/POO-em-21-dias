package dia2;

import java.util.ArrayList;
import java.util.List;

public class PilhaComList implements PilhaTAD{

    private String elemento;

    List<String> pilha = new ArrayList<>();

    @Override
    public void push(String elemento) {
        pilha.add(elemento);
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilha.remove(pilha.size() - 1); 
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilha.get(pilha.size() - 1); 
    }

    @Override
    public boolean isEmpty() {
        return pilha.size() == 0;
    }

    public void mostrar(){
        System.out.println(pilha);
    }
    
}



