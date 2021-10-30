package trees;


public class BinarySearchTree<T> extends BinaryTree{

  public void add(T value) {
    value = (T) value;
    Node node = new Node(value);


      if(value != null){
        Node current = str;

        while(current != null){
          if((int) value > (int) current.getValue()  ){
            if(current.getRight() == null){
              current.setRight(node);
              return;
            }
            current = current.getRight();

          }
          else{
            if(current.getLeft() == null){
              current.setLeft(node);
              return;
            }
            current = current.getLeft();
          }
        }
      }else {
        str = node;
      }
    }

  public boolean contains(T value) {
    value = (T) value;

      if (str != null) {
        Node current = str;
        while (current != null) {
          if ((int) value == (int) current.getValue()){
            return true;
          }

          if ((int) value > (int) current.getValue()) {
            if (current.getRight() == null) {
              return false;
            }
            current = current.getRight();

          } else {
            if (current.getLeft() == null) {
              return false;
            }
            current = current.getLeft();
          }
        }
      } else {
        return false;
      }

    return false;
  }

  }
