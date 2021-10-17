package linkedList;

public class LinkedList<T> {
  Node head;
  private int size;


  public LinkedList() {
    this.head = null;
  }

  public void insert(String insertNode) {
    if (head == null) {
      Node node = new Node(insertNode);
      head = node;
      size++;
    } else {
      Node node = new Node(insertNode);
      node.next = head;
      head = node;
      size++;
    }
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public boolean includes(String insertNode) {
    Node current = head;
    while (current.next != null) {
      if (current.value == insertNode) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    String outPut = "";
    if (head == null) {
      System.out.println("Empty List ");
    } else {
      Node current = head;
      while (current != null) {
        outPut = outPut + "{" + current.value() + "}" + " -> ";
        current = current.next();
      }
      outPut =outPut+"NULL";
    }
    return outPut;
  }
}
