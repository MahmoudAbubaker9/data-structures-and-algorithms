package linkedList;

import org.checkerframework.checker.units.qual.Length;

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
