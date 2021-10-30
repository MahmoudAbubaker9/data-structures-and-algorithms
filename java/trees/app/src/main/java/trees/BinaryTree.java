package trees;

import java.util.ArrayList;

public class BinaryTree {
  public Node str=null;


  public String inOrder(Node str) {
    String InOrderOut = "";
    if (str.getRight() != null) {
      inOrder(str.getLeft());
    }
    InOrderOut += str.getValue() +"->";
    if (str.getRight() != null) {
      inOrder(str.getRight());
    }
    return InOrderOut;
  }

  public String preOrder(Node str) {
    String preOrderOut = "";

    preOrderOut += str.getValue() +"->";
    if (str.getLeft() != null) {
      preOrder(str.getLeft());
    }
    if (str.getRight() != null) {
      preOrder(str.getRight());
    }
    return preOrderOut;

  }

  public String postOrder(Node str) {
    String postOrderOut = "";
    if (str.getLeft() != null) {
      postOrder(str.getLeft());
    }
    if (str.getRight() != null) {
      postOrder(str.getRight());
    }
    postOrderOut += str.getLeft() + " => ";
    return postOrderOut;
  }
}
