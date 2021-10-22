package stackandqueue;

public class Node {

  private Node next;
  private String value;

  public Node(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value='" + value + '\'' +
      '}';
  }
}
