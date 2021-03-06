/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  Sort sort = new Sort();

    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

  @Test
  public void insertionSortWithNormalArray(){
    int[] array = {20,18,12,8,5,-2};
    int[] outputArray = sort.insertionSort(array);
    int[] expectedOutput = {-2,5,8,12,18,20};
    assertArrayEquals(expectedOutput,outputArray);
  }

  @Test
  public void insertionSortWithFewUniques(){
    int[] array = {5,12,7,5,5,7};
    int[] outputArray = sort.insertionSort(array);
    int[] expectedOutput = {5,5,5,7,7,12};
    assertArrayEquals(expectedOutput,outputArray);
  }

  @Test
  public void margeSortTest(){
    int[] array = {5,12,7,5,5,7};
    int n=array.length;
    int[] outputArray = sort.merge(array,0,n-1);
    int[] expectedOutput = {5,5,5,7,7,12};
    assertArrayEquals(expectedOutput,outputArray);
  }

  @Test
  public void margeSortTest2(){
    int[] array = {20,18,12,8,5,-2};
    int n=array.length;
    int[] outputArray = sort.merge(array,0,n-1);
    int[] expectedOutput = {-2,5,8,12,18,20};
    assertArrayEquals(expectedOutput,outputArray);
  }

  @Test
  public void quickSortTest1(){
    int[] array = {20,18,12,8,5,-2};
    int n=array.length;
    int[] outputArray = sort.quick(array,0,n-1);
    int[] expectedOutput = {-2,5,8,12,18,20};
    assertArrayEquals(expectedOutput,outputArray);
  }

  @Test
  public void quickSortSimilarTest(){
    int[] array = {5,12,7,5,5,7};
    int n=array.length;
    int[] outputArray = sort.quick(array,0,n-1);
    int[] expectedOutput = {5,5,5,7,7,12};
    assertArrayEquals(expectedOutput,outputArray);
  }

}
