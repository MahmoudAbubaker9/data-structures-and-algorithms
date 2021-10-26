package stackandqueue;

public class PseudoQueue {
  public Stack stackOne = new Stack();
  public Stack stackTwo = new Stack();

  public void enqueue(String value) {
    stackOne.push(value);
  }


  public String dequeue() {
    {
      while (stackOne.top != null){
        stackTwo.push(stackOne.pop());
      }
      String stackPop= stackTwo.pop();
      while (stackTwo.top != null){
        stackOne.push(stackTwo.pop());
      }
      return stackPop;
    }}


  @Override
  public String toString() {
    if (stackOne.top == null) {
      return "The List is empty";
    } else {
      String outPut = "";
      while (stackOne.top != null){
        outPut += "{" + stackOne.top.getValue()+ "}" +" -> ";
        stackOne.top = stackOne.top.getNext();
      }
      outPut += "{Null}";
      return outPut;
    }
  }
}

