package hashTables;

public class Node<K, V> {
  public K key;
  public V value;

  final int hashCode;

  Node<K, V> next;

  public Node(K key, V value, int hashCode) {
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
  }

  @Override
  public String toString() {
    return "{" +
      "key=" + key +
      ", value=" + value +
      '}';
  }
}

