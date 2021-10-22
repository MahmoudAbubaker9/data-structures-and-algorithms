package linkedList;

public class Node {
  public Node next;
  public String value;

  public Node(String value){
    this.value=value;
  }


  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      '}';
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public String value() {
    return value;
  }
}
