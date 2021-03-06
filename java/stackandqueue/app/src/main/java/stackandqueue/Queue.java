package stackandqueue;

public class Queue {
  Node front;
  Node rear;
  private int size =0;

  public void enqueue(String value) {
    if (front == null) {
      Node node = new Node(value);
      front = node;
      rear = node;
      size++;
    } else {
      Node node = new Node(value);
      rear.setNext(node);
      rear = node;
      size++;
    }
  }

  public String dequeue (){
    if(front == null) {
      return "The List is empty";

    }else {
      String value = front.getValue();
      front = front.getNext();
      size--;
      return value;
    }
  }

  public String peek() {
    if (front == null) {
      return "The List is empty";
    } else {
      return front.getValue();
    }
  }

  public boolean isEmpty() {
    if (front == null) {
      return true;
    }else {
      return false;
    }
  }

  public  String DuckDuckGoose(String[] arr,int k){
    Queue duckQueue=new Queue();
    for (int i=0;i<arr.length;i++) {
      duckQueue.enqueue(arr[i]);
    }
    for (int i=0;i<arr.length-1;i++) {
      for (int x = 1; x < k; x++) {
        duckQueue.enqueue(duckQueue.dequeue());
      }
      duckQueue.dequeue();
    }
    return duckQueue.dequeue();

  }


  @Override
  public String toString() {
    if (front == null) {
      return "The List is empty";
    } else {
      String outPut = "";
      Node node = front;
      while (node != null){
        outPut += "{" + node.getValue()+ "}" +" -> ";
        node = node.getNext();
      }
      outPut += "{Null}";
      return outPut;
    }
  }
}
