package linkedList;

public class LinkedList<T> {
  Node head;
  private int size =0;


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

  public void append(String appendNode)  {
    Node lastNode = new Node(appendNode);
    if(head == null){
      head = lastNode;
      size++;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = lastNode;
      size++;
    }
  }

  public void insertBefore(String beforeString, String beforeNode) {
    Node beforeInsert = new Node(beforeNode);
    if (head == null) {
      System.out.println("The Value"+ beforeString +"is not exist");
    } else if (head.value == beforeString) {
      insert(beforeNode);
      size++;
    } else {
      Node current = head;
      while (current.next != null) {
        if (current.next.value == beforeString) {
          beforeInsert.next = current.next;
          current.next = beforeInsert;
          size++;
          break;
        }
        current = current.next;
      }
    }
  }

  public void insertAfter(String afterString, String afterNode) {
    Node afterInsert = new Node(afterNode);
    if (head == null) {
      System.out.println("The Value"+ afterString +"is not exist");
    } else if (head.value == afterString) {
      insert(afterNode);
      size++;
    } else {
      Node current = head;
      while (current != null) {
        if (current.value == afterString) {
          afterInsert.next = current.next;
          current.next = afterInsert;
          size++;
        }
        current = current.next;
      }
    }
  }

  public String kthFromEnd(int k) {
    if (head == null) {
      return "Exception -> List is empty";
    }

    Node current = head;
    int nodeLength = 0;
    while (current != null) {
      nodeLength++;
      current = current.next;
    }
    if(k > nodeLength || k < 0) {
      return "Exception -> the number should be from 0 to "+nodeLength+" (Node Length)";
    } else {
      current = head;
      int kLocation = nodeLength - k ;
      for (int i = 0; i <= kLocation; i++) {
        if (i == kLocation) {
          return "{"+k+"th node value from the end is: {" + current.value + "}";

        }
        current = current.next;
      }
      return "Exception";
    }
  }

  public Node zipLists(LinkedList list1, LinkedList list2) {

    if (list1.head == null){
      return list2.head;
    }

    if (list2.head == null){
      return list1.head;
    }

    LinkedList newList = new LinkedList();

    newList.head = list1.head;
    Node current = list1.head;
    list1.head = list1.head.next;

    while (current != null && list1.head != null || list2.head != null){
      if (list2.head != null) {
        current.next = list2.head;
        list2.head = list2.head.next;
        current = current.next;
      }
      if (list1.head != null) {
        current.next = list1.head;
        list1.head = list1.head.next;
        current = current.next;
      }
    }
    return newList.head;
  }


  public void reverseList(){
    if (head == null) {
      System.out.println("the ListList is empty");
    }
    Node current = this.head;
    Node nextNode = null ;
    Node previousNode = null;
    while (current!=null){
      nextNode = current.getNext();
      current.setNext(previousNode);
      previousNode = current;
      current= nextNode;
    }
    this.head = previousNode;
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
        current = current.getNext();
      }
      outPut =outPut+"NULL";
    }
    return outPut;
  }
}
