package linkedList;

public class LinkedList<T> {
  Node head;


  public LinkedList() {
    this.head = null;
  }

  public void insert(T value ) {
    Node<T> addNode =  new  Node<>(value);
    addNode.next = head ;
    head = addNode;
  }

  public boolean includes(T value) {
    Node current = head;
    while (current.next != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public String toString() {
    Node current = head;
    String finalResult = "";
    while (current != null) {
      finalResult += "{" + current.value + "} -> ";
      current = current.next;
    }
    finalResult += "NULL";
    return finalResult;
  }

}
