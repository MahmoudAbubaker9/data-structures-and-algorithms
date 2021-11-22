package hashTables.TreeIntersection;

import hashTables.Node;

public class TreeNode<T> {
  private int data;
  private TreeNode left;
  private TreeNode right;

  public TreeNode(int data) {
    this.data = data;
    left = right = null;
  }

  public int getData() {
    return data;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

}
