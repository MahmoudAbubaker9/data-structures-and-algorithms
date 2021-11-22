package hashTables;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class hashTable<K, V> {

  private ArrayList<Node<K, V>> array;
  private int bucketsNumber;
  private int size;


  public hashTable() {
    array = new ArrayList<>();
    bucketsNumber = 10;
    size = 0;
    //add null to because the arraylist flexible and if it is not added, the size will be zero
    for (int index = 0; index < bucketsNumber; index++) {
      array.add(null);
    }
  }

  private int hashKey(K key) {
    return Objects.hashCode(key);
  }

  private int hash(K key) {
    int hashKey = hashKey(key);
    int index = hashKey % bucketsNumber;
    index = index < 0 ? index * -1 : index;
    return index;
  }


  public void add(K key, V value) {

    int bucketIndex = hash(key);
    int hashKey = hashKey(key);

    Node<K, V> head = array.get(bucketIndex);

    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashKey) {
        head.value = value;
        return;
      }

      head = head.next;
    }

    size++;
    head = array.get(bucketIndex);
    Node<K, V> newNode = new Node<>(key, value, hashKey);
    newNode.next = head;
    array.set(bucketIndex, newNode);

  }

  public V get(K key) {
    int bucketIndex = hash(key);
    int hashKey = hashKey(key);

    Node<K, V> head = array.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashKey) {
        return head.value;
      }

      head = head.next;
    }
    return null;
  }

  public boolean contains(K key) {
    int bucketIndex = hash(key);
    int hashKey = hashKey(key);
    Node<K, V> head = array.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && hashKey == head.hashCode)
        return true;
    }

    return false;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }

  public static String firstRepeatedWord(String Word) {
    String [] words = Word.toLowerCase(Locale.ROOT).split(" ");
    hashTable<String, Integer> hashTable = new hashTable<>();
    for (int i = 0; i < words.length; i++) {
      if(words[i].contains(",")){
        /// substring is for remove "," from array
        words[i] = words[i].substring(0, words[i].length()-1);
      }
      if(!words[i].equals("")){
        if (hashTable.get(words[i]) != null){
          return words[i];
        }
        hashTable.add(words[i],i);
      }
    }
    return "there is no repeated word";
  }

}




