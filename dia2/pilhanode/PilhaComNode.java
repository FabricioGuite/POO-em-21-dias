package dia2.pilhanode;

import dia2.PilhaTAD;

public class PilhaComNode implements PilhaTAD{
    private Node topo;
    private int tamanho;    

    public PilhaComNode(){
        this.topo = null;
        this.tamanho = 0;
    }

    public String pop(){
        if(isEmpty()){
            throw new IllegalStateException("A pilha está vazia.");            
        }
        String data = topo.data;
        topo = topo.getNextNode();
        tamanho--;
        return data;
    }

    public void push(String data){
        Node novoNode = new Node(data);
        novoNode.setNextNode(topo);
        topo = novoNode;
        tamanho++;
    }

    public String peek(){
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.data;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public void mostrar(){
        Node atual = topo;
        while(atual != null){
            System.out.println(atual.toString());
            atual = atual.getNextNode();
        }
    }
}