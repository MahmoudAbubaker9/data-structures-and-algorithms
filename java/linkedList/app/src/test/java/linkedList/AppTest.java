/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @DisplayName("Can successfully instantiate an empty linked list")
  @Test void emptyTest() {
    LinkedList<Integer> emptyList = new LinkedList<>();
    String expected="NULL";
    assertEquals(expected,emptyList.toString());
  }

  @DisplayName("Can properly insert into the linked list")
  @Test void InsertListTest() {

    LinkedList<Integer> testList = new LinkedList<>();
    testList.insert(9);
    testList.insert(2);
    testList.insert(13);
    testList.insert(14);
    String expected="{14} -> {13} -> {2} -> {9} -> NULL";
    assertEquals(expected,testList.toString());

  }

  @DisplayName("The head property will properly point to the first node in the linked list")
  @Test void headPropertyListTest() {
    LinkedList<Integer> testList = new LinkedList<>();
    testList.insert(1);
    testList.insert(2);
    testList.insert(3);
    testList.insert(4);
    int expected=4;
    assertEquals(expected,testList.head.value);
  }

  @Test void MultiNodeTest() {
    LinkedList<Integer> testList = new LinkedList<>();
    testList.insert(9);
    testList.insert(8);
    testList.insert(3);
    testList.insert(1);
    testList.insert(31);
    String expected="{31} -> {1} -> {3} -> {8} -> {9} -> NULL";
    assertEquals(expected,testList.toString());
  }

  @Test void includeTest() {
    LinkedList<Integer> testList = new LinkedList<>();
    testList.insert(5);
    testList.insert(4);
    testList.insert(13);
    testList.insert(2);
    testList.insert(11);
    assertTrue(testList.includes(5));
    assertFalse(testList.includes(6));

  }

  @Test void returnCollectionTest() {
    LinkedList<Integer> testList = new LinkedList<>();
    testList.insert(20);
    testList.insert(25);
    testList.insert(88);
    testList.insert(-1);
    testList.insert(45);
    String expected="{45} -> {-1} -> {88} -> {25} -> {20} -> NULL";
    assertEquals(expected,testList.toString());
  }


}
