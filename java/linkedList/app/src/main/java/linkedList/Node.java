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

  public Node next() {
    return next;
  }

  public String value() {
    return value;
  }
}
