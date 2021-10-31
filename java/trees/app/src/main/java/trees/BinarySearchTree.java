package trees;


public class BinarySearchTree<T> extends BinaryTree{

  public void add(T value) {
    this.root= new Node<>(value);
    Node node = new Node(value);

    if(root != null){
        Node current = root;

        while(current != null){
          if((int) value > (int) current.value  ){
            if(current.right == null){
              current.right = node;
              return;
            }
            current = current.right;

          }
          else{
            if(current.left == null){
              current.left = node;
              return;
            }
            current = current.left;
          }
        }
      }else {
        root = node;
      }
    }

  public boolean contains(T value) {
    this.root= new Node<>(value);
    value = (T) value;

      if (root != null) {
        Node current = root;
        while (current != null) {
          if ((int) value == (int) current.value){
            return true;
          }

          if ((int) value > (int) current.value) {
            if (current.right == null) {
              return false;
            }
            current = current.right;

          } else {
            if (current.left == null) {
              return false;
            }
            current = current.left;
          }
        }
      } else {
        return false;
      }

    return false;
  }

  }
