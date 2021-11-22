package hashTables.TreeIntersection;


import hashTables.hashTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;


public class TreeIntersection<K, T> {

  public Hashtable<Integer, Integer> Hashtable = new Hashtable<>();

  public List<Integer> intersections = new ArrayList<>();

  public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    if (tree1.getRoot() == null || tree2.getRoot() == null) {
      return null;
    }
    traverse(tree2.getRoot());
    compare(tree1.getRoot());
    return intersections;
  }

  public void traverse(TreeNode node) {

    if (node != null) {

      int count = 0;
      if (Hashtable.get(node.getData()) == null) {
        count = 1;
      } else {
        count = count + 1;
      }
      Hashtable.put(node.getData(), count);
      traverse(node.getLeft());
      traverse(node.getRight());
    }
  }

  public void compare(TreeNode node) {
    if (node != null) {
      if (Hashtable.get(node.getData()) != null) {
        intersections.add(node.getData());
      }
      compare(node.getLeft());
      compare(node.getRight());
    }
  }


}
