package stackandqueue;

public class Stack {

  Node top;
  private int size =0;

  public void push (String value){
    if(top == null) {
      Node addNode = new Node(value);
      top = addNode;
      size++;

    }else {
      Node addNode = new Node(value);
      addNode.setNext(top);
      top = addNode;
      size++;
    }
  }

  public String pop (){
    if(top == null) {
      return "The List is empty";

    }else {
      String value = top.getValue();
      top = top.getNext();
      size--;
      return value;
    }
  }

  public String peek() {
    if (top == null) {
      return "The List is empty";
    } else {
      return top.getValue();
    }
  }

  public boolean isEmpty() {
    if (top == null) {
      return true;
    }else {
      return false;
    }
  }

  @Override
  public String toString() {
    if (top == null) {
      return "The List is empty";
    } else {
      String outPut = "";
      Node node = top;
      while (node != null){
        outPut += "{" + node.getValue()+ "}" +" -> ";
        node = node.getNext();
      }
      outPut += "{Null}";
      return outPut;
    }
  }
}

