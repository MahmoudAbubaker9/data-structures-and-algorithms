/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

  @Test public void testHashTableAddingKeyValue() {
    hashTable<String, Integer> test = new hashTable<>();
    test.add("mahmoud",1);
    boolean output = test.contains("mahmoud");
    assertTrue(output);
  }

  @Test public void testHashTableRetrievingValueBasedOnKey() {
    hashTable<String, Integer> test = new hashTable<>();
    test.add("mahmoud",3);
    int output = test.get("mahmoud");
    assertEquals(3, output);
  }

  @Test public void testHashTableRetrievingNullForNotExistKey() {
    hashTable<String, Integer> test = new hashTable<>();
    test.add("deyaa",3);
    assertEquals(null, test.get("Fadi"));
  }

  @Test public void testHashTableHandleTheCollision() {
    hashTable<String, Integer> test = new hashTable<>();
    test.add("Hi", 50);
    test.add("My", 60);
    test.add("Name", 70);
    test.add("Mahmoud", 90);

    assertTrue(test.contains("Name"));
    assertTrue(test.contains("Mahmoud"));
    assertEquals(70, test.get("Name"));
    assertEquals(90, test.get("Mahmoud"));
  }

  @Test public void testHashTableRetrieveValueFromBucketHasCollision() {
    hashTable<String, Integer> test = new hashTable<>();
    test.add("Hi", 50);
    test.add("My", 60);
    test.add("Name", 70);
    test.add("Mahmoud", 90);

    assertTrue(test.contains("Name"));
    assertTrue(test.contains("Mahmoud"));
    assertEquals(70, test.get("Name"));
    assertEquals(90, test.get("Mahmoud"));
    int output1 = test.get("Name");
    int output2 = test.get("Mahmoud");
    assertEquals(90, output2);
    assertEquals(70, output1);

  }
}
