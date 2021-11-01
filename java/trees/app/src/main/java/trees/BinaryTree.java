package trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree<T> {
  Node<T> root;
  private int max = 0;

  public ArrayList<T> inOrder(Node root) {
    ArrayList<T> InOrderOut = new ArrayList<>();
    if (root != null) {

      if (root.left != null)
        InOrderOut.addAll(inOrder(root.left));

      InOrderOut.add((T) root.value);

      if (root.right != null)
        InOrderOut.addAll(inOrder(root.right));
    }
    return InOrderOut;
  }

  public ArrayList<T> preOrder(Node root) {
    ArrayList<T> preOrderOut = new ArrayList<>();
    if (root != null) {
      preOrderOut.add((T) root.value);
      if (root.left != null)
        preOrderOut.addAll(preOrder(root.left));
      if (root.right != null)
        preOrderOut.addAll(preOrder(root.right));
    }
    return preOrderOut;
  }

  public ArrayList<T> postOrder(Node str) {
    ArrayList<T> postOrderOut = new ArrayList<>();
    if (str != null) {
      if (root.left != null)
        postOrderOut.addAll(postOrder(root.left));
      if (root.right != null)
        postOrderOut.addAll(postOrder(root.right));
      postOrderOut.add((T) root.value);
    }
    return postOrderOut;
  }

  public String treeMax(){
    if (root == null) {
      return "Empty";
    }
    int max = 0;
    ArrayList<T> maxTree = preOrder(root);

    for (int i = 0; i < maxTree.size(); i++) {
      if(Integer.parseInt(""+maxTree.get(i)) > max){
        max =Integer.parseInt(""+maxTree.get(i));
      }
    }
    return "The maximum number is "+max;
  }


  public ArrayList<T> breadthFirst(Node root) {

    ArrayList<T> breadthTree = new ArrayList<>();
    LinkedList<Node> breadthList = new LinkedList<>();

    Node current = this.root;

    if (this.root != null) {
      breadthList.add(current);
      for (int i = 0; i < breadthTree.size(); i++) {
        current = breadthList.get(i);
        if (current.left != null) {
          breadthList.add(current.left);
        }
        if (current.right != null) {
          breadthList.add(current.right);
        }
      }
    }
    for (int j = 0; j < breadthList.size(); j++) {
      breadthTree.add((T)breadthList.get(j).value);
    }
    return breadthTree;
  }


}

