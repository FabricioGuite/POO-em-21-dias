package dia2;

public class Node {

    public String data;
    @Override
    public String toString() {
      return  data;
    }

    private Node next;
  
    public Node(String data) {
      this.data = data;
      this.next = null;
    }
  
    public void setNextNode(Node node) {
      this.next = node;
    }
  
    public Node getNextNode() {
      return this.next;
    }
  
  }