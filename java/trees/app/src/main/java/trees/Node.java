package trees;

public class Node<T> {
  private T value;
  private Node left;
  private Node right;

  public Node(T value) {
    this.value = value;
  }


  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
