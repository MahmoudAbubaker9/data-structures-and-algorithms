package linkedList;

public class Node <T> {
  public Node next;  //declare next variable.
  public T value;   //declare value variable with generic datatype.

  //this is the constructor.
  public Node(T value){
    this.value=value;
  }

}
