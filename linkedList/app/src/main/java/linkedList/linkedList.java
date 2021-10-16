
class LinkedList<T> {

  linkedList.Node head;

  public LinkedList() {
    this.head = null;
  }

  public void insert(T value) {
    linkedList.Node newNode = new linkedList.Node(value);
    newNode.next = head;
    head = newNode;
  }

  public boolean includes(T value) {
    linkedList.Node current = head;
    while (current.next != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public String toString() {
    linkedList.Node current = head;
    String finalResult = "";
    while (current != null) {
      finalResult += "{" + current.value + "} -> ";
      current = current.next;
    }
    finalResult += "NULL";
    return finalResult;
  }

}
