package stackandqueue;

public class Brackets {


  public static boolean validateBrackets(String stc) {
    Stack bracketStack = new Stack();
    for (int i = 0; i < stc.length(); i++) {
      if (stc.charAt(i) == '{' || stc.charAt(i) == '[' || stc.charAt(i) == '(') {
        bracketStack.push(stc.charAt(i));
        continue;
      } else if (bracketStack.isEmpty()) {
        return false;
      }

      String bracket;

      if (stc.charAt(i) == ')') {
        bracket = bracketStack.pop();
        if (bracket == '{' || bracket == '[')
          return false;
      } else if (stc.charAt(i) == '}') {
        bracket = bracketStack.pop();
        if (bracket == '(' || bracket == '[')
          return false;
      } else if (stc.charAt(i) == ']') {
        bracket = bracketStack.pop();
        if (bracket == '(' || bracket == '{')
          return false;
      }
    }
    return (bracketStack.isEmpty());
  }
}
