/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

  @Test
  void InstantiateAnEmptyTreeTest() {
    BinarySearchTree<Integer> EmptyTree = new BinarySearchTree<>();
    assertNotNull(EmptyTree);
  }

  @Test
  void InstantiateTreeWithSingleTest() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(1);
    assertEquals(1, binarySearchTree.root.value);
  }

  @Test
  void LeftAndRightChildTest() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(2);
    binarySearchTree.add(3);
    binarySearchTree.add(1);
    assertEquals(2, binarySearchTree.root.value);
    assertEquals(1, binarySearchTree.root.left.value);
    assertEquals(3, binarySearchTree.root.right.value);
  }

  @Test
  void preorderTest() {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.add(2);
    binarySearchTree.add(1);
    binarySearchTree.add(3);
    assertEquals(Arrays.asList(1,2,3).toArray(), binarySearchTree.preOrder(binarySearchTree.root).toArray());

  }

  @Test
  void inorderTest() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(2);
    binarySearchTree.add(1);
    binarySearchTree.add(3);
    assertEquals(Arrays.asList(5,1,6).toArray(), binarySearchTree.inOrder(binarySearchTree.root).toArray());

  }


  // Can successfully return a collection from a postorder traversal
  @Test
  void postorderTest() {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(5);
    binarySearchTree.add(1);
    binarySearchTree.add(6);
    assertEquals(Arrays.asList(2).toArray(), binarySearchTree.postOrder(binarySearchTree.root).toArray());

  }





}
