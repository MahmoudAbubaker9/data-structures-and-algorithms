package trees;

public class TreeFizzBuzz {

  KNode root = null;

  public void fizzBuzzTree(KNode tree) {


    if (tree == null) return;
    else {

      if ((tree.value % 3) == 0) {
        System.out.print("Fizz ");

      } else if ((tree.value % 5) == 0) {
        System.out.print("Buzz ");

      } else if ((tree.value % 15) == 0) {
        System.out.print("FizzBuzz ");

      } else {
        System.out.print(tree.value +" ");
      }
      fizzBuzzTree(tree.left);
      fizzBuzzTree(tree.right);
    }

  }

  void fizzBuzzTreeOut(KNode node)
  {
    if (node == null)
      return;
    System.out.print(node.value + " ");
    fizzBuzzTreeOut(node.left);
    fizzBuzzTreeOut(node.right);
  }

  @Override
  public String toString() {
    return "TreeFizzBuzz{" +
      "root=" + root +
      '}';
  }
}
