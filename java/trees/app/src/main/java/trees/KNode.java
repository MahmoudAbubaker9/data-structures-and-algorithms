package trees;

public class KNode {

  int value;
  KNode left;
  KNode right;

  public KNode(int value){
    this.value=value;
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    return "KNode{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
